package day31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputSteamTest {
    public static void main(String[] args) {
        String s="致远软件，科创板上市公司(股票代码:688369.SH)，20年专注协同办公领域，通过协同管理产品、平台及解决方案,为组织提供：协同办公(OA)、移动办公、人事管理、合同管理、系统集成、集团管控等，构建企业的数智化协同运营平台，加速企业数字化转型升级，成就高绩效组织。";
        s.replace("致远软件","致远互联");
        s.concat("致远互联，欢迎你的加入");
        String path="C:\\Users\\Administrator\\Desktop\\seeyon.txt";
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(path,true);
            byte[] bytes=s.getBytes();
            fos.write(bytes);
            fos.write(bytes);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
