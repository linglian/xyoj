package util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;

/**
 *
 * @author lol
 */
public final class NumberGet {

    private Map<String, Map<String, Object>> pro;

    public NumberGet(Map<String, Object> u) {
        pro = new HashMap();
        pro.put("u", u);
    }

    public NumberGet(Map<String, Object> u, Map<String, Object> o) {
        pro = new HashMap();
        pro.put("u", u);
        pro.put("o", o);
    }

    public NumberGet() {
        pro = new HashMap();
    }

    public void setPro(Map<String, Map<String, Object>> pro) {
        this.pro = pro;
    }

    public Object operation(String str) throws OperationException {
        if (str.charAt(0) == '#') {
            return str.substring(1);
        } else {
            return (int) Double.parseDouble(operation(str, 0).getValue().toString());
        }
    }

    // 获取属性值 (默认的时候，将单词转换为数值)
    private Pair getNumOfV(String str, int index) throws OperationException {
        String tempStr = new String();
        int i;
        char t;
        String owner = ""; // 属性所有者
        for (i = index; i < str.length(); i++) {
            t = str.charAt(i);
            if (t == '.') {
                i++;
                break;
            }
            owner += t;
        }
        // System.out.println("归属(NumberGet.65):" + owner);
        for (; i < str.length(); i++) {
            t = str.charAt(i);
            if (t == 'v' && i < str.length() && str.charAt(i + 1) == '(') {
                Pair p = getNumOfV(str, i + 2);
                i = Integer.parseInt(p.getKey().toString());
                tempStr += p.getValue().toString();
            } else if (Character.isLetterOrDigit(t) || t == '_') {
                tempStr += t;
            } else if (t == ')') {
                break;
            } else if (t == '(') {
                throw new OperationException("小括号不匹配---( " + str.substring(0, i) + " )");
            } else {
                throw new OperationException("只能是字符数字和下划线('_')---( " + str.substring(0, i) + " )");
            }
        }
        if (i == str.length()) {
            throw new OperationException("未找到匹配的右花括号---( " + str.substring(0, i) + " )");
        }
        Map<String, Object> own = pro.get(owner);
        if (own == null) {
            pro.put(owner, new HashMap());
            own = pro.get(owner);
        }
        Object o = own.get(tempStr);
        if (o == null) {
            pro.get(owner).put(tempStr, "0");
            o = pro.get(owner).get(tempStr);
        }
        return new Pair(i, (int) Double.parseDouble(o.toString()));
    }

    // 获取属性值
    private Pair getNum(String str, int index) throws OperationException {
        String tempStr = new String();
        int i;
        char t;
        String owner = ""; // 属性所有者
        for (i = index; i < str.length(); i++) {
            t = str.charAt(i);
            if (t == '.') {
                i++;
                break;
            }
            owner += t;
        }
        // System.out.println("归属(NumberGet.112):" + owner);
        for (; i < str.length(); i++) {
            t = str.charAt(i);
            if (t == 'v' && i < str.length() && str.charAt(i + 1) == '(') {
                Pair p = getNumOfV(str, i + 2);
                i = Integer.parseInt(p.getKey().toString());
                tempStr += p.getValue().toString();
            } else if (Character.isLetterOrDigit(t) || t == '_') {
                tempStr += t;
            } else if (t == '}') {
                break;
            } else if (t == '{') {
                throw new OperationException("花括号不匹配---( " + str.substring(0, i) + " )");
            } else {
                throw new OperationException("只能是字符数字和下划线('_')---( " + str.substring(0, i) + " )");
            }
        }
        if (i == str.length()) {
            throw new OperationException("未找到匹配的右花括号---( " + str.substring(0, i) + " )");
        }
        // 获取不同属性域中的值
        Map<String, Object> own = pro.get(owner);
        if (own == null) {
            pro.put(owner, new HashMap());
            own = pro.get(owner);
        }
        Object o = own.get(tempStr);
        if (o == null) {
            pro.get(owner).put(tempStr, "0");
            o = pro.get(owner).get(tempStr);
        }

        return new Pair(i, Double.parseDouble(o.toString()));
    }

    
    // 获取属性值，不存在花括号时
    private Pair getNumWithoutLR(String str, int index) throws OperationException {
        int i = index;
        char t;
        int length = str.length();
        char[] chars = str.toCharArray();
        String leftStr = new String();
        for (; i < length; i++) {
            if (!Character.isLetterOrDigit(chars[i]) && chars[i] != '.') {
                break;
            }
            leftStr += chars[i];
        }
        String owner = "t"; // 属性所有者
        if (leftStr.indexOf('.') != -1) {
            owner = leftStr.substring(0, leftStr.indexOf('.'));
            leftStr = leftStr.substring(leftStr.indexOf('.') + 1);
        }
        Map<String, Object> own = pro.get(owner);
        if (own == null) {
            pro.put(owner, new HashMap());
            own = pro.get(owner);
        }
        Object o = own.get(leftStr);
        if (o == null) {
            pro.get(owner).put(leftStr, "0");
            o = pro.get(owner).get(leftStr);
        }
        return new Pair(i, Double.parseDouble(o.toString()));
    }
    
    // 计算二个数
    private double getNum(double a, Object opr, double b) throws OperationException {
        //Thread.sleep(1);
        //System.out.println("\t\t" + a + opr.toString() + b);
        if (opr.equals("==")) {
            if (a == b) {
                return 1;
            } else {
                return 0;
            }
        } else if (opr.equals("!=")) {
            if (a == b) {
                return 0;
            } else {
                return 1;
            }
        } else if (opr.equals(">=")) {
            if (a >= b) {
                return 1;
            } else {
                return 0;
            }
        } else if (opr.equals("<=")) {
            if (a <= b) {
                return 1;
            } else {
                return 0;
            }
        } else if (opr.equals("&&")) {
            if (a != 0 && b != 0) {
                return 1;
            } else {
                return 0;
            }
        } else if (opr.equals("||")) {
            if (a != 0 || b != 0) {
                return 1;
            } else {
                return 0;
            }
        } else if (opr.equals('>')) {
            if (a > b) {
                return 1;
            } else {
                return 0;
            }
        } else if (opr.equals('<')) {
            if (a < b) {
                return 1;
            } else {
                return 0;
            }
        } else if (opr.equals('+')) {
            return a + b;
        } else if (opr.equals('-')) {
            return a - b;
        } else if (opr.equals('*')) {
            return a * b;
        } else if (opr.equals('/')) {
            return a / b;
        }  else if (opr.equals('%')) {
            return a % b;
        } else if (opr.equals('=')) {
            return a;
        } else {
            throw new OperationException("非法运算符---( " + opr + " )");
        }
    }

    // 获取上一个数字和运算符
    private void getNum(Stack s, double num) throws OperationException {
        if (!s.empty()) {
            Object op = s.pop();
            Object leftNum = s.pop();
            num = getNum(Double.parseDouble(leftNum.toString()), op, num);
        }
        s.add(num);
    }

    // 是否为运算符
    private boolean isOp(char t) {
        if (t == '!' || t == '=' || t == '<' || t == '>' || t == '+' || t == '-' || t == '/' || t == '*' || t == '%') {
            return true;
        } else {
            return false;
        }
    }

    // 计算
    private Pair operation(String str, int index) throws OperationException {
        Stack s = new Stack();
        double num = 0, num3 = 10, temp;
        boolean flag = false;
        boolean isTrue = true;
        int i;
        char t;
        for (i = index; i < str.length(); i++) {
            t = str.charAt(i);
            if (t == '(') {
                Pair p = operation(str, i + 1);
                if (isTrue) {
                    num = Double.parseDouble(p.getValue().toString());
                }
                i = Integer.parseInt(p.getKey().toString());
            } else if (t == ')') {
                break;
            } else if (t == '?') {
                if (!s.empty()) {
                    Object op = s.pop();
                    Object leftNum = s.pop();
                    num = getNum(Double.parseDouble(leftNum.toString()), op, num);
                }
                if (num == 0) {
                    isTrue = false;
                }
                num = 0;
                num3 = 10;
                flag = false;
            } else if (t == ':') {
                if (!isTrue) {
                    num = 0;
                    num3 = 10;
                    flag = false;
                    isTrue = true;
                } else {
                    isTrue = false;
                }
            } else if (!isTrue) {
                // doNothing
            } else if (t == '{') {
                Pair p = getNum(str, i + 1);
                num = Double.parseDouble(p.getValue().toString());
                i = Integer.parseInt(p.getKey().toString());
            } else if (t == '.') {
                if (!flag) {
                    flag = true;
                } else {
                    throw new OperationException("非法小数点---( " + str.substring(0, i + 1) + " )");
                }
            } else if (Character.isDigit(t)) {
                if (!flag) {
                    num *= 10;
                    num += t - '0';
                } else {
                    temp = t - '0';
                    temp /= num3;
                    num3 *= 10;
                    num += temp;
                }
            } else if (isOp(t)) {
                if ((i + 1) < str.length() && isOp(str.charAt(i + 1))) {
                    getNum(s, num);
                    s.add(t + String.valueOf(str.charAt(i + 1)));
                    i++;
                } else {
                    getNum(s, num);
                    s.add(t);
                }
                num = 0;
                num3 = 10;
                flag = false;
            } else if (t == '|') {
                if (str.charAt(i + 1) != t) {
                    throw new OperationException("非法条件运算符---( " + str.substring(0, i + 1) + " )");
                }
                getNum(s, num);
                s.add("||");
                Pair p = operationOfAndOr(str, i + 2);
                System.out.println(p);
                num = Double.parseDouble(p.getValue().toString());
                i = Integer.parseInt(p.getKey().toString());
            }  else if (t == '&') {
                if (str.charAt(i + 1) != t) {
                    throw new OperationException("非法条件运算符---( " + str.substring(0, i + 1) + " )");
                }
                getNum(s, num);
                s.add("&&");
                Pair p = operationOfAndOr(str, i + 2);
                num = Double.parseDouble(p.getValue().toString());
                i = Integer.parseInt(p.getKey().toString());
            } else if (Character.isLetter(t)){
                Pair p = getNumWithoutLR(str, i);
                num = Double.parseDouble(p.getValue().toString());
                i = Integer.parseInt(p.getKey().toString());
                i--;
            }
        }
        while (s.size() > 1) {
            Object op = s.pop();
            Object leftNum = s.pop();
            num = getNum(Double.parseDouble(leftNum.toString()), op, num);
        }
        return new Pair(i, num);
    }

    // 计算&& 和 ||
    private Pair operationOfAndOr(String str, int index) throws OperationException {
        Stack s = new Stack();
        double num = 0, num3 = 10, temp;
        boolean flag = false;
        boolean isTrue = true;
        int i;
        char t;
        for (i = index; i < str.length(); i++) {
            t = str.charAt(i);
            if (t == '(') {
                Pair p = operation(str, i + 1);
                if (isTrue) {
                    num = Double.parseDouble(p.getValue().toString());
                }
                i = Integer.parseInt(p.getKey().toString());
            } else if (t == ')') {
                break;
            } else if (t == '?') {
                if (!s.empty()) {
                    Object op = s.pop();
                    Object leftNum = s.pop();
                    num = getNum(Double.parseDouble(leftNum.toString()), op, num);
                }
                if (num == 0) {
                    isTrue = false;
                }
                num = 0;
                num3 = 10;
                flag = false;
            } else if (t == ':') {
                if (!isTrue) {
                    num = 0;
                    num3 = 10;
                    flag = false;
                    isTrue = true;
                } else {
                    isTrue = false;
                }
            } else if (!isTrue) {
                // doNothing
            } else if (t == '{') {
                Pair p = getNum(str, i + 1);
                num = Double.parseDouble(p.getValue().toString());
                i = Integer.parseInt(p.getKey().toString());
            } else if (t == '.') {
                if (!flag) {
                    flag = true;
                } else {
                    throw new OperationException("非法小数点---( " + str.substring(0, i + 1) + " )");
                }
            } else if (Character.isDigit(t)) {
                if (!flag) {
                    num *= 10;
                    num += t - '0';
                } else {
                    temp = t - '0';
                    temp /= num3;
                    num3 *= 10;
                    num += temp;
                }
            } else if (isOp(t)) {
                if ((i + 1) < str.length() && isOp(str.charAt(i + 1))) {
                    getNum(s, num);
                    s.add(t + String.valueOf(str.charAt(i + 1)));
                    i++;
                } else {
                    getNum(s, num);
                    s.add(t);
                }
                num = 0;
                num3 = 10;
                flag = false;
            } else if (Character.isLetter(t)){
                Pair p = getNumWithoutLR(str, i);
                num = Double.parseDouble(p.getValue().toString());
                i = Integer.parseInt(p.getKey().toString());
                i--;
            } else if (t == '|' || t == '&' || t == '?' || t == ':') {
                i--;
                break;
            }
        }
        while (s.size() > 1) {
            Object op = s.pop();
            Object leftNum = s.pop();
            num = getNum(Double.parseDouble(leftNum.toString()), op, num);
        }
        return new Pair(i, num);
    }

    public static void main(String[] args) {
        Map<String, Object> u = new HashMap();
        u.put("gjl", 100);
        u.put("temp_100_lvl", 6);
        Map<String, Object> o = new HashMap();
        o.put("fyl", 100);
        NumberGet ng = new NumberGet(u, o);
        try {
            System.out.println(ng.operation("u.gjl+u.gjl"));
        } catch (OperationException ex) {
            ex.printStackTrace();
        }
    }
}
