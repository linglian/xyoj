package com.oj.linglian.OJ;

import com.oj.linglian.entity.Coder;
import com.oj.linglian.entity.Checker;
import com.oj.linglian.entity.CoderBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.StringUtil;

public class XYOJ {

    private final String tempFilePath = "c:\\code";
    private final String tempFileName = "c:\\code\\temp";
    private boolean flag = false;
    private static XYOJ ins = new XYOJ();
    private Runtime run;
    private long time;
    private Process p;
    private static String exeStr;
    private int line;
    private final String[] badWord = {"asm", "dir", "kill", "time", "exec", "fork", "create", "nice", "mk", "setu", "setg", "sets", "sete", "getu", "getp", "getg", "link", "tmp", "wait", "system", "own", "pause", "sock", "signal", "raise", "sleep", "truncate", "chroot", "sigsuspend", "remove", "open", "close", "window", "windows"};

    public XYOJ() {
        InputStream in = XYOJ.class.getResourceAsStream("./conf.properties");
        Properties pro = new Properties();
        try {
            pro.load(in);
            exeStr = pro.getProperty("exe");
        } catch (IOException ex) {
            exeStr = "\" -g3 -I\"C:\\Program Files (x86)\\Dev-Cpp\\MinGW64\\include\" -I\"C:\\Program Files (x86)\\Dev-Cpp\\MinGW64\\x86_64-w64-mingw32\\include\" -I\"C:\\Program Files (x86)\\Dev-Cpp\\MinGW64\\lib\\gcc\\x86_64-w64-mingw32\\4.8.1\\include\" -I\"C:\\Program Files (x86)\\Dev-Cpp\\MinGW64\\lib\\gcc\\x86_64-w64-mingw32\\4.8.1\\include\\c++\" -L\"C:\\Program Files (x86)\\Dev-Cpp\\MinGW64\\lib\" -L\"C:\\Program Files (x86)\\Dev-Cpp\\MinGW64\\x86_64-w64-mingw32\\lib\" -static-libgcc -g3";
        }
    }

    public static XYOJ getIns() {
        if (ins == null) {
            ins = new XYOJ();
        }
        return ins;
    }

    private boolean createTempFile(String code, long startTime) {
        PrintWriter out = null;
        try {
            File fileDir = new File("c:\\code");
            if (!fileDir.exists()) {
                fileDir.mkdirs();
            }
            File file = new File("c:\\code\\temp_" + startTime + ".cpp");
            out = new PrintWriter(file, "GBK");
            out.print(code);
            out.flush();
            out.close();
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    private boolean deleteFile(long startTime) {
        File file = new File("c:\\code\\temp_" + startTime + ".exe");
        for (int i = 0; !file.delete() && i < 5; i++);
        return true;
    }

    private String runGcc(long startTime)
            throws IOException, InterruptedException {
        this.run = Runtime.getRuntime();
        String exe = "g++.exe \"c:\\code\\temp_" + startTime + ".cpp" + "\" -o \"" + "c:\\code\\temp" + "_" + startTime + ".exe\" " + exeStr;
        System.out.println(exe);
        this.p = this.run.exec(exe);
        this.p.waitFor();
        BufferedReader r = new BufferedReader(new InputStreamReader(this.p.getErrorStream()));
        String error = new String();
        String temp = null;
        String exeName = "c:\\code\\temp_" + startTime + ".exe";
        while ((temp = r.readLine()) != null) {
            if (temp.contains(exeName)) {
                error += temp.substring(temp.indexOf(exeName) + exeName.length() + 1) + "\n";
            } else {
                error += temp + "\n";
            }
        }
        return error;
    }

    private String runExe(Coder coder, String input, long startTime) throws IOException, RuntimeException {
        try {
            this.p = this.run.exec("c:\\code\\temp_" + startTime + ".exe");
            Thread t = new Thread() {
                public void run() {
                    XYOJ.this.time = new Date().getTime();
                    XYOJ.this.flag = true;
                    while (XYOJ.this.flag) {
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException localInterruptedException) {
                        }
                        if (new Date().getTime() - XYOJ.this.time > 1000) {
                            p.destroy();
                        }
                    }
                }
            };
            t.start();
            if (input != null) {
                PrintWriter out = new PrintWriter(this.p.getOutputStream());
                out.println(input);
                out.flush();
            }
            BufferedReader r = new BufferedReader(new InputStreamReader(this.p.getInputStream()));
            String result = new String();
            String temp = null;
            while ((temp = r.readLine()) != null) {
                result += temp + "\n";
            }
            if (result.length() != 0) {
                result = result.substring(0, result.length() - 1);
            } else {
                throw new RuntimeException("内存超过限制（有可能是根本没有任何输出）");
            }
            return result;
        } catch (Error ex) {
            throw new RuntimeException("输出超出限制");
        } catch (Exception ex) {
            throw new RuntimeException("异常详情:" + ex.getMessage());
        }
    }

    private String runExe(Coder coder, long startTime) throws IOException, RuntimeException {
        try {
            this.p = this.run.exec("c:\\code\\temp_" + startTime + ".exe");
            Thread t = new Thread() {
                public void run() {
                    XYOJ.this.time = new Date().getTime();
                    XYOJ.this.flag = true;
                    while (XYOJ.this.flag) {
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException localInterruptedException) {
                        }
                        if (new Date().getTime() - XYOJ.this.time > 1000) {
                            p.destroy();
                        }
                    }
                }
            };
            t.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(this.p.getInputStream()));
            String result = new String();
            String temp = null;
            while ((temp = r.readLine()) != null) {
                result += temp + "\n";
            }
            if (result.length() != 0) {
                result = result.substring(0, result.length() - 1);
            } else {
                throw new RuntimeException("内存超过限制（有可能是根本没有任何输出）");
            }
            return result;
        } catch (Error ex) {
            throw new RuntimeException("输出超出限制");
        } catch (Exception ex) {
            throw new RuntimeException("异常详情:" + ex.getMessage());
        }
    }

    private String checkCode(Coder coder) {
        String codes = coder.getCode();
        for (String str : badWord) {
            if (codes.contains(str)) {
                return str;
            }
        }
        return null;
    }

    public synchronized CoderBuilder getResult(CoderBuilder coder, List<Checker> iaoList, long startTime) {
        try {
            String check = checkCode(coder.build());
            if (check != null) {
                return coder.setStatus("-4").setResult("检测到非法字符串---" + check).setEndTime("0").setStartTime("0");
            }
            if (!createTempFile(coder.build().getCode(), startTime)) {
                return coder.setStatus("-5").setResult("创建文件失败!").setEndTime("0").setStartTime("0");
            }
            String error = runGcc(startTime);
            if (!"".equals(error)) {
                return coder.setStatus("-6").setResult(error).setEndTime("0").setStartTime("0");
            }
            coder.setStartTime(String.valueOf(new Date().getTime()));
            boolean isRight = true;
            StringBuffer resultList = new StringBuffer();
            if (iaoList != null) {
                for (Checker iao : iaoList) {
                    String result = "";
                    result = runExe(coder.build(), iao.getInput(), startTime);
                    resultList.append(result).append("\n");
                    String str = iao.getOutput();
                    if (str != null) {
                        str = str.replaceAll("\r", "");
                        if (!String.valueOf(result).equals(str)) {
                            isRight = false;
                            break;
                        }
                    }
                }
            } else {
                String result = "";
                result = runExe(coder.build(), startTime);
                resultList.append(result);
            }
            coder.setEndTime(String.valueOf(new Date().getTime()));
            deleteFile(startTime);
            if (isRight) {
                return coder.setStatus("1").setResult(resultList.toString());
            } else {
                return coder.setStatus("2").setResult(resultList.toString());
            }
            /*
             String t = new String();
             for (int i = 0; i < result.length(); i++) {
             t += String.valueOf((int)result.charAt(i)) + ' ';
             }
             t += "\n";
             for (int i = 0; i < str.length(); i++) {
             t += String.valueOf((int)str.charAt(i)) + ' ';
             }
             t += "\n";
             result += "\n" + result.length() + "\n长度" + str.length();
             */
        } catch (IOException ex) {
            return coder.setStatus("-1").setResult(ex.getMessage()).setEndTime("0").setStartTime("0");
        } catch (InterruptedException ex) {
            return coder.setStatus("-2").setResult(ex.getMessage()).setEndTime("0").setStartTime("0");
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            return coder.setStatus("-3").setResult(ex.getMessage()).setEndTime("0").setStartTime("0");
        } finally {
            p.destroy();
            this.flag = false;
        }
    }

    public static void main(String[] args)
            throws IOException, InterruptedException {
        Runnable b = new Runnable() {
            public void run() {
                List<Checker> al = new ArrayList();
                Checker ino;
                for (int i = 0; i < 10; i++) {
                    ino = new Checker();
                    ino.setInput(String.valueOf(i));
                    ino.setOutput(String.valueOf(i));
                    al.add(ino);
                }
                String str = "#include<iostream> \n#include<string>\n\nusing namespace std;\n\nint main() {\n    int a = 0;\n cin >> a;\n cout << a << endl;\n    return 0;\n}";
                Coder coder = XYOJ.getIns().getResult(new CoderBuilder().setCode(str), al, new Date().getTime()).build();
                System.out.println(StringUtil.subLong(coder.getEndTime(), coder.getStartTime()) + "=" + coder.getStatus());
            }
        };
        for (int i = 0; i < 1; i++) {
            Thread t = new Thread(b);
            t.start();
        }
    }
}
