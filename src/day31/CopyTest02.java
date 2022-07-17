package day31;

import java.io.*;

/**
 * 拷贝目录：
 * 	将D:\course拷贝到C盘根下....
 *
 * 	需要使用到：
 * 		FileInputStream
 * 		FileOutputStream
 * 		File
 *
 * 	可能需要使用到递归。你尝试实现一下！
 */
public class CopyTest02 {
    public static void main(String[] args) {
        //拷贝原路径
        File srcFile=new File("C:\\Users\\Administrator\\Desktop\\javase");
        //目标路径
        File destFile=new File("D:\\");
        //拷贝方法
        copy(srcFile,destFile);
    }

    public static void copy(File src,File dest){
        //获取源下面的目录
        File[] files=src.listFiles();
        for (File file:files){
            if (file.isDirectory()){
                String srcDir=file.getAbsolutePath();
                String destDir=(dest.getAbsolutePath().endsWith("\\")?dest.getAbsolutePath():dest.getAbsolutePath()+"\\")+srcDir.substring(3);
                File newFile=new File(destDir);
                if (!newFile.exists()){
                    newFile.mkdir();
                }
            }
            copy(file,dest);
        }
        //如果这个file是一个文件，写入文件
        if (src.isFile()){
            FileInputStream fis=null;
            FileOutputStream fos=null;
            try {
                fis=new FileInputStream(src);
                String path=(dest.getAbsolutePath().endsWith("\\")?dest.getAbsolutePath():dest.getAbsolutePath()+"\\")+src.getAbsolutePath().substring(3);
                fos=new FileOutputStream(path);
                byte[] bytes=new byte[1024*1024];
                int readCount=0;
                while ((readCount=fis.read(bytes))!=-1){
                    fos.write(bytes,0,readCount);
                }
                //fos刷新
                fos.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fis!=null){
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fos!=null){
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }


    }
}
