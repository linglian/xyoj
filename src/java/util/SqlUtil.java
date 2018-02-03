/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;

/**
 * 对于不认识的操作符，将不进行转换，直接附加，具体看例程
 *
 * @author lol
 */
public class SqlUtil {

    public final static int SQL_UPDATE = 1;
    public final static int SQL_SELECT = 2;
    public final static int SQL_DELETE = 3;
    public final static int SQL_INSERT = 4;
    private StringBuffer strBuffer = null;
    private int status = 0;
    private List<String> dataNames = null; // 存储数据表名字
    private List<String> beforeWheres = null; // where之前的属性（适用于更新、插入）
    private List<Pair<String, Pair<String, String>>> afterWheres = null;// where之前的属性（适用于更新、删除、查询）
    private List<String> last = null; // 在查询语句最后添加的属性（适用于查询）

    /**
     * 重置
     *
     * @return
     */
    private SqlUtil reset() {
        dataNames = new ArrayList<String>();
        beforeWheres = new ArrayList<String>();
        last = new ArrayList<String>();
        afterWheres = new ArrayList<Pair<String, Pair<String, String>>>();
        return this;
    }

    public SqlUtil() {
        reset();
        this.strBuffer = new StringBuffer();
    }

    public SqlUtil(StringBuffer strBuffer) {
        reset();
        this.strBuffer = strBuffer;
    }

    /**
     * 设置sql语句模式
     *
     * @param status （SQL_UPDATE、SQL_DELETE、SQL_SELECT、SQL_INSERT）
     * @return
     */
    public SqlUtil setStatus(int status) {
        this.status = status;
        return this;
    }

    /**
     * 增加数据表名字（顺序）
     *
     * @param dateName
     * @return
     */
    public SqlUtil addDataName(String dateName) {
        dataNames.add(dateName);
        return this;
    }

    /**
     * 增加查询语句最后的条件
     *
     * @param last （有参的支持group by、limit，无参数的无条件支持）
     * @return
     */
    public SqlUtil addLast(String last) {
        this.last.add(last);
        return this;
    }

    /**
     * 设置Where之后的关键字、运算符、与上一个比较之间的关系
     *
     * @param name 被比较的关键字
     * @param operation 运算符（默认=）
     * @param relation 与上一个比较间关系（默认为AND）
     * @return
     */
    public SqlUtil addAfterWheres(String name, String operation, String relation) {
        afterWheres.add(new Pair<String, Pair<String, String>>(name,
                new Pair<String, String>(operation, relation)));
        return this;
    }

    public SqlUtil addAfterWheres(String name, String operation) {
        addAfterWheres(name, operation, "AND");
        return this;
    }

    public SqlUtil addAfterWheres(String name) {
        addAfterWheres(name, "=", "AND");
        return this;
    }

    public SqlUtil addAfterWheres(String[] names) {
        for (int i = 0; i < names.length; i++) {
            addAfterWheres(names[i], "=", "AND");
        }
        return this;
    }

    public SqlUtil addAfterWheresOfNot(String[] names) {
        for (int i = 0; i < names.length; i++) {
            addAfterWheres(names[i], "!=", "AND");
        }
        return this;
    }

    /**
     * 设置where之前的属性（按添加顺序进行添加）
     *
     * @param name
     * @return
     */
    public SqlUtil addBeforeWheres(String name) {
        beforeWheres.add(name);
        return this;
    }

    public SqlUtil addBeforeWheres(String[] names) {
        for (int i = 0; i < names.length; i++) {
            beforeWheres.add(names[i]);
        }
        return this;
    }

    private void addDataName() {
        int size = dataNames.size();
        for (int i = 0; i < size; i++) {
            String str = dataNames.get(i);
            if (i != 0) {
                strBuffer.append(",");
            }
            strBuffer.append(str).append(" ");
        }
    }

    private void addWhere() {
        if (afterWheres.size() != 0) {
            strBuffer.append("WHERE ");
            int size = afterWheres.size();
            for (int i = 0; i < size; i++) {
                Pair<String, Pair<String, String>> str = afterWheres.get(i);
                Pair<String, String> p = str.getValue();
                if (i != 0) {
                    strBuffer.append(p.getValue()).append(" ");
                }
                strBuffer.append(str.getKey()).append(" ")
                        .append(getOperation(p.getKey())).append(" ");
            }
        }
    }

    private void addLast() {
        if (last.size() != 0) {
            int size = last.size();
            for (int i = 0; i < size; i++) {
                String str = last.get(i);
                strBuffer.append(getLast(str)).append(" ");
            }
        }
    }

    private String getOperation(String operation) {
        operation = operation.toLowerCase();
        if ("%like%".equals(operation)) {
            return "LIKE %?%";
        } else if ("%like".equals(operation)) {
            return "LIKE %?";
        } else if ("like%".equals(operation)) {
            return "LIKE ?%";
        } else if ("%notlike%".equals(operation)) {
            return "NOT LIKE %?%";
        } else if ("notlike%".equals(operation)) {
            return "NOT LIKE ?%";
        } else if ("%notlike".equals(operation)) {
            return "NOT LIKE %?%";
        }
        String[] op = {"=", ">", "<", "<=", ">="};
        for (int i = 0; i < op.length; i++) {
            if (op[i].equals(operation)) {
                return operation + " ?";
            }
        }
        return operation;
    }

    /**
     * 在此处添加可支持的Last语句
     *
     * @param last
     * @return
     */
    private String getLast(String last) {
        if ("group by".equals(last)) {
            return "GROUP BY ?";
        } else if ("limit".equals(last)) {
            return "LIMIT ?, ?";
        } else {
            return last;
        }
    }

    private String buildUpdate() {
        strBuffer.append("UPDATE ");
        addDataName();
        int size = beforeWheres.size();
        strBuffer.append("SET ");
        for (int i = 0; i < size; i++) {
            String str = beforeWheres.get(i);
            if (i != 0) {
                strBuffer.append(",");
            }
            strBuffer.append(str).append(" = ? ");
        }
        addWhere();
        return strBuffer.toString();
    }

    private String buildDelete() {
        strBuffer.append("DELETE FROM ");
        addDataName();
        addWhere();
        return strBuffer.toString();
    }

    private String buildInsert() {
        strBuffer.append("INSERT INTO ");
        addDataName();
        strBuffer.append("(");
        int size = beforeWheres.size();
        for (int i = 0; i < size; i++) {
            String str = beforeWheres.get(i);
            if (i != 0) {
                strBuffer.append(",");
            }
            strBuffer.append(str).append(" ");
        }
        strBuffer.append(") VALUES (");
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                strBuffer.append(",");
            }
            strBuffer.append("? ");
        }
        strBuffer.append(")");
        return strBuffer.toString();
    }

    private String buildSelect() {
        strBuffer.append("SELECT ");
        int size = beforeWheres.size();
        for (int i = 0; i < size; i++) {
            String str = beforeWheres.get(i);
            if (i != 0) {
                strBuffer.append(",");
            }
            strBuffer.append(str).append(" ");
        }
        strBuffer.append("FROM ");
        addDataName();
        addWhere();
        addLast();
        return strBuffer.toString();
    }

    public String build() {
        switch (status) {
            case SQL_UPDATE:
                return buildUpdate();
            case SQL_DELETE:
                return buildDelete();
            case SQL_INSERT:
                return buildInsert();
            case SQL_SELECT:
                return buildSelect();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new SqlUtil().setStatus(SqlUtil.SQL_SELECT)
                .addDataName("USER").addBeforeWheres("username")
                .addBeforeWheres("score").addAfterWheres("userid")
                .addAfterWheres("userid", "IN (SELECT uid FROM user WHERE status=0)").build());
    }
}
