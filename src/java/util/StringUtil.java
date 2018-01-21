/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author lol
 */
public class StringUtil {

    private StringUtil() {

    }

    public static String getUp(String str) {
        return getUp(str, 1);
    }

    public static String getUp(String str, int number) {
        if (str == null || str.length() == 0) {
            return "";
        } else if (str.length() == 1) {
            return str.toUpperCase();
        } else {
            return str.substring(0, number).toUpperCase() + str.substring(number);
        }
    }

    public static String getLow(String str) {
        return getLow(str, 1);
    }

    public static String getLow(String str, int number) {
        if (str == null || str.length() == 0) {
            return "";
        } else if (str.length() == 1) {
            return str.toLowerCase();
        } else {
            return str.substring(0, number).toLowerCase() + str.substring(number);
        }
    }

    public static String subInt(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return "";
    }

    public static String subDouble(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return String
                    .valueOf(Double.parseDouble(a) - Double.parseDouble(b));
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return "";
    }

    public static String subFloat(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return String.valueOf(Float.parseFloat(a) - Float.parseFloat(b));
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return "";
    }

    public static String subLong(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return String.valueOf(Long.parseLong(a) - Long.parseLong(b));
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return "";
    }

    public static String addInt(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return "";
    }

    public static String addDouble(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return String
                    .valueOf(Double.parseDouble(a) + Double.parseDouble(b));
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return "";
    }

    public static String addFloat(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return String.valueOf(Float.parseFloat(a) + Float.parseFloat(b));
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return "";
    }

    public static String addLong(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return String.valueOf(Long.parseLong(a) + Long.parseLong(b));
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return "";
    }

    public static boolean isBigInt(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return Integer.parseInt(a) >= Integer.parseInt(b);
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return false;
    }
    
    public static boolean isSmallInt(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return Integer.parseInt(a) < Integer.parseInt(b);
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return false;
    }
    
    public static boolean isBigLong(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return Long.parseLong(a) > Long.parseLong(b);
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return false;
    }
    
    public static boolean isSmallLong(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return Long.parseLong(a) < Long.parseLong(b);
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return false;
    }
    
    
    public static boolean isBigFloat(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return Float.parseFloat(a) > Float.parseFloat(b);
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return false;
    }
    
    public static boolean isSmallFloat(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return Float.parseFloat(a) < Float.parseFloat(b);
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return false;
    }
    
    
    public static boolean isBigDouble(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return Double.parseDouble(a) > Double.parseDouble(b);
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return false;
    }
    
    public static boolean isSmallDouble(String a, String b) {
        try {
            if (a == null || "".equals(a)) {
                a = "0";
            }
            if (b == null || "".equals(b)) {
                b = "0";
            }
            return Double.parseDouble(a) < Double.parseDouble(b);
        } catch (Exception ex) {
            System.out.println("StringUtil" + ex.getMessage());
        }
        return false;
    }
    
}
