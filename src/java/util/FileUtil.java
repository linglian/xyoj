/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lol
 */
public class FileUtil {

    public static String checkDirName(String dirName) {
        if (!dirName.endsWith(File.separator)) { // 结尾是否以"/"结束
            dirName += File.separator;
        }
        return dirName;
    }
    /**
     * 创建文件夹
     * @param path
     * @param dirName
     * @return 
     */
    public static String mkdir(String path, String dirName) {
        return mkdir(path + dirName);
    }
    public static String mkdir(String dirName) {
        File file = new File(dirName);
        if (!file.mkdir()) {
            // System.out.println("创建失败" + dirName);
        }
        return checkDirName(dirName);
    }

    /**
     * 创建文件
     * @param path
     * @param fileName
     * @return 
     */
    public static File mkFile(String path, String fileName) {
        path = FileUtil.checkDirName(path);
        return mkFile(path + fileName);
    }
    public static File mkFile(String fileName) {
        try {
            File file = new File(fileName);
            file.createNewFile();
            return file;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static PrintWriter getPrintWriter(File file) {
        try {
            return new PrintWriter(new FileOutputStream(file));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    public static void main(String[] args) {
        System.out.println("".equals(null));
        System.out.println("".equals(""));
        System.out.println(mkFile(mkdir("c:/123") + "2.txt"));
    }

}
