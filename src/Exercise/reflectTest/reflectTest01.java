package Exercise.reflectTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class reflectTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        FileReader fr=new FileReader("classinfo.properties");
        Properties pro=new Properties();
        pro.load(fr);
        fr.close();
        String classname=pro.getProperty("classname");
        Class c = Class.forName(classname);
        Object obj=c.newInstance();
        System.out.println(obj);
    }
}
