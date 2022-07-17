package day31;

import java.io.*;

/**
 * ����Ŀ¼��
 * 	��D:\course������C�̸���....
 *
 * 	��Ҫʹ�õ���
 * 		FileInputStream
 * 		FileOutputStream
 * 		File
 *
 * 	������Ҫʹ�õ��ݹ顣�㳢��ʵ��һ�£�
 */
public class CopyTest02 {
    public static void main(String[] args) {
        //����ԭ·��
        File srcFile=new File("C:\\Users\\Administrator\\Desktop\\javase");
        //Ŀ��·��
        File destFile=new File("D:\\");
        //��������
        copy(srcFile,destFile);
    }

    public static void copy(File src,File dest){
        //��ȡԴ�����Ŀ¼
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
        //������file��һ���ļ���д���ļ�
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
                //fosˢ��
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
