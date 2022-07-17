package day31;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("src\\bb.properties");
        Properties properties=new Properties();
        properties.load(fr);
        String name=properties.getProperty("name");
        System.out.println(name);
    }
}
