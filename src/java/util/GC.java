/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;

/**
 *
 * @author lol
 */
public class GC {

    private Map<String, Map<String, Object>> pro;

    static Map<String, Integer> keyword = null;

    public GC() {
        if (keyword == null) {
            keyword = new HashMap();
            keyword.put("for", 3);
            keyword.put("while", 2);
            keyword.put("if", 1);
        }
        pro = new HashMap();
    }

    // 去除空格
    private int clearSpace(char[] chars, int start, int end) {
        int length = end;
        int i = start;
        // 去空格
        for (; i < length; i++) {
            if (chars[i] != ' ' && chars[i] != '\t' && chars[i] != '\n' && chars[i] != '\r') {
                break;
            }
        }
        return i;
    }

    // 获得左边操作语句
    private Pair getLeftStr(char[] chars, int start, int end) {
        int length = end;
        int i = start;
        String leftStr = new String();
        for (; i < length; i++) {
            // 判断非字母（不包含逗号）
            if (!Character.isLetterOrDigit(chars[i]) && chars[i] != '.') {
                break;
            }
            leftStr += chars[i];
        }
        Pair p = new Pair(i, leftStr);
        return p;
    }

    // 获得右边操作语句
    private Pair getRightStr(char[] chars, int start, int end) {
        int length = end;
        int i = start;
        String rightStr = new String();
        // 以分号为结尾
        for (; i < length; i++) {
            if (chars[i] == ';') {
                break;
            }
            rightStr += chars[i];
        }
        Pair p = new Pair(i, rightStr);
        return p;
    }

    // 获得左右括号匹配
    private Pair getLeftAndRight(char[] chars, int start, int end, char cLeft, char cRight) {
        // System.out.println("括号匹配：" + cLeft + "|" + cRight + "=====" + String.valueOf(chars).substring(start, end));
        int length = end;
        int i = start;
        int lefts = 0;
        int left = -1;
        int right = -1;
        for (int j = i; j < length; j++) {
            if (chars[j] == cLeft) {
                if (lefts == 0) {
                    left = j;
                }
                lefts++;
            } else if (chars[j] == cRight) {
                if (lefts == 1) {
                    right = j;
                    break;
                } else {
                    lefts--;
                }
            }
        }
        return new Pair(left, right);
    }

    // 处理单行赋值运算
    private Pair getValue(String line, int start, int end) throws OperationException {
        char[] chars = line.toCharArray();
        int length = end;

        int i = start;
        // 去空格
        i = clearSpace(chars, i, length);
        Pair p;

        String leftStr = new String(); // 左边操作对象
        String centerStr = new String(); // 中间操作符
        String rightStr = new String(); // 左边操作对象
        // 检测左边操作对象
        p = getLeftStr(chars, i, length);
        leftStr = (String) p.getValue();
        i = Integer.parseInt(p.getKey().toString());
        // System.out.println("左边操作对象为: " + leftStr);

        // 去空格
        i = clearSpace(chars, i, length);

        // 检测中间操作符
        for (; i < length; i++) {
            if (Character.isLetterOrDigit(chars[i]) || chars[i] == ' ' || chars[i] == '{') {
                break;
            }
            centerStr += chars[i];
        }

        // System.out.println("右边的操作对象为: " + rightStr);
        String own = "t";
        if (leftStr.indexOf('.') != -1) {
            own = leftStr.substring(0, leftStr.indexOf('.'));
            leftStr = leftStr.substring(leftStr.indexOf('.') + 1);
        }
        Map<String, Object> t = pro.get(own);
        if (t == null) {
            pro.put(own, new HashMap());
        }

        t = pro.get(own);
        // 去空格
        i = clearSpace(chars, i, length);

        // 右边操作对象
        p = getRightStr(chars, i, length);
        rightStr = (String) p.getValue();
        i = Integer.parseInt(p.getKey().toString());

        NumberGet numberGet = new NumberGet();
        numberGet.setPro(pro); // 将数据导入

        if (centerStr.equals("++")) {
            System.out.println(i);
            t.put(leftStr, Double.parseDouble(t.get(leftStr).toString()) + 1);
        } else {
            if ("=".equals(centerStr)) { // 计算等式
                t.put(leftStr, numberGet.operation(rightStr));
            }
        }
        p = new Pair(i, t.get(leftStr));
        return p;
    }

    // 执行if 和 else
    private int runIFAndElse(String line, int start, int end) throws OperationException {
        char[] chars = line.toCharArray();
        int length = end;
        int i = start;
        Pair p;
        i = clearSpace(chars, i, length);
        p = getLeftAndRight(chars, i, length, '(', ')');
        int left = Integer.parseInt(p.getKey().toString());
        int right = Integer.parseInt(p.getValue().toString());
        // System.out.println("if 的 左右括号为：" + left + "," + right);
        i = clearSpace(chars, right + 1, length);
        // 寻找if范围
        p = getLeftAndRight(chars, i, length, '{', '}');
        int tStartOfIf = Integer.parseInt(p.getKey().toString());
        int tEndOfIf = Integer.parseInt(p.getValue().toString());
        i = clearSpace(chars, tEndOfIf + 1, length);
        p = getLeftStr(chars, i, length);
        String tStr = (String) p.getValue();
        int ti = Integer.parseInt(p.getKey().toString());
        int tStartOfElse = -1;
        int tEndOfElse = -1;
        // 寻找else范围
        if ("else".equals(tStr)) {
            i = clearSpace(chars, ti, length);
            p = getLeftAndRight(chars, i, length, '{', '}');
            tStartOfElse = Integer.parseInt(p.getKey().toString());
            tEndOfElse = Integer.parseInt(p.getValue().toString());
            i = tEndOfElse;
        } else {
            i = tEndOfIf;
        }
        NumberGet numberGet = new NumberGet();
        numberGet.setPro(pro); // 将数据导入

        if (Integer.parseInt(numberGet.operation(line.substring(left + 1, right)).toString()) != 0) { // 执行if 语句
            readLine(line.substring(tStartOfIf + 1, tEndOfIf));
        } else { // 执行else 语句
            if (tStartOfElse != -1 && tEndOfElse != -1) {
                readLine(line.substring(tStartOfElse + 1, tEndOfElse));
            }
        }
        return i;
    }

    // 执行while
    private int runWhile(String line, int start, int end) throws OperationException {
        char[] chars = line.toCharArray();
        int length = end;
        int i = start;
        i = clearSpace(chars, i, length);
        // 获取()内的内容
        Pair p = getLeftAndRight(chars, i, length, '(', ')');
        int left =Integer.parseInt(p.getKey().toString());
        int right = Integer.parseInt(p.getValue().toString());
        i = clearSpace(chars, right + 1, length);
        // 获取{}内的内容
        p = getLeftAndRight(chars, i, length, '{', '}');
        int startOfWhile = Integer.parseInt(p.getKey().toString());
        int endOfWhile = Integer.parseInt(p.getValue().toString());
        NumberGet numberGet = new NumberGet();
        numberGet.setPro(pro); // 将数据导入
        // 执行while循环
        while (Integer.parseInt(numberGet.operation(line.substring(left + 1, right)).toString()) != 0) {
            readLine(line.substring(startOfWhile + 1, endOfWhile));
        }
        return endOfWhile;
    }

    // 执行for
    private int runFor(String line, int start, int end) throws OperationException {
        char[] chars = line.toCharArray();
        int length = end;
        int i = start;
        i = clearSpace(chars, i, length);
        // 获取()内的内容
        Pair p = getLeftAndRight(chars, i, length, '(', ')');
        int left = Integer.parseInt(p.getKey().toString());
        int right = Integer.parseInt(p.getValue().toString());
        // 分析()内的内容
        String temp = line.substring(left + 1, right);
        String firstStr = temp.substring(0, temp.indexOf(';'));
        temp = temp.substring(temp.indexOf(';') + 1);
        String secondStr = temp.substring(0, temp.indexOf(';'));
        String thirdStr = temp.substring(temp.indexOf(';') + 1);
        i = clearSpace(chars, right + 1, length);
        // 获取{}内的内容
        p = getLeftAndRight(chars, i, length, '{', '}');
        int startOfFor = Integer.parseInt(p.getKey().toString());
        int endOfFor = Integer.parseInt(p.getValue().toString());
        NumberGet numberGet = new NumberGet();
        numberGet.setPro(pro); // 将数据导入

        // 执行for循环
        for (readLine(firstStr, 0, firstStr.length()); Integer.parseInt(numberGet.operation(secondStr).toString()) != 0; readLine(thirdStr, 0, thirdStr.length())) {
            readLine(line.substring(startOfFor + 1, endOfFor));
        }
        return endOfFor;
    }
    // 计算从start到end的识别，主要识别关键字。

    public Map<String, Map<String, Object>> getPro() {
        return pro;
    }

    public void addMap(String key, Map<String, Object> m) {
        if (pro.containsKey(key)) {
            pro.remove(key);
        }
        pro.put(key, m);
    }

    public Map<String, Object> getMap(String key) {
        if (pro.containsKey(key)) {
            return pro.get(key);
        } else {
            return new HashMap<String, Object>();
        }
    }

    private Object readLine(String line, int start, int end) throws OperationException {
        // System.out.println("当前运行语句为：" + line);
        char[] chars = line.toCharArray();
        int length = end;
        int i = start;
        Pair p = new Pair(0, "None");
        // 去空格
        i = clearSpace(chars, i, length);

        String leftStr = new String(); // 左边操作对象，有可能是关键字。

        // 检测
        p = getLeftStr(chars, i, length);
        leftStr = (String) p.getValue();
        i = Integer.parseInt(p.getKey().toString());

        // 判断关键字，进行相应操作
        if (keyword.get(leftStr) != null) {
            // System.out.println("关键字：" + leftStr);
            switch (keyword.get(leftStr)) {
                case 1: // if else
                    i = runIFAndElse(line, i, length);
                    break;
                case 2: // while
                    i = runWhile(line, i, length);
                    break;
                case 3: // for
                    i = runFor(line, i, length);
                    break;
            }
        } else {
            int tEnd = line.indexOf(';', start);
            if (tEnd == -1) {
                tEnd = end;
            }
            p = getValue(line, start, tEnd);
            i = Integer.parseInt(p.getKey().toString());
            //System.out.println("当前结果为：" + line.substring((int) p.getKey()) + "||" + p);
        }

        if (i + 1 >= length) {
            return p.getValue();
        } else {
            String str = line.substring(i + 1, length);
            return readLine(str, 0, str.length());
        }
    }

    public Object readLine(String line) throws OperationException {
        return readLine(line, 0, line.length());
    }

    public Object readLineFromFile(String fileName) throws OperationException, UnsupportedEncodingException, FileNotFoundException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
        StringBuffer out = new StringBuffer();
        String line = null;
        while ((line = in.readLine()) != null) {
            out.append(line);
        }
        String str = out.toString();
        return readLine(str, 0, str.length());
    }

    public static void main(String[] args) throws OperationException, FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        GC gc = new GC();
        System.out.println(gc.readLine("o.lvl = 100; u.lvl ={o.lvl}+400;"));
        System.out.println(gc.getPro());
    }

}
