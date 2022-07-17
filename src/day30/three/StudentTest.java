package day30.three;

import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args) {
        TreeSet<Student> student=new TreeSet<>();
        student.add(new Student("liusan",20,90.0F));
        student.add(new Student("lisi",22,90.0F));
        student.add(new Student("wangwu",20,99.0F));
        student.add(new Student("sunliu",22,100.0F));
        for (Student s:student){
            System.out.println(s);
        }
        System.out.println("========================");
        TreeSet<Student> s=new TreeSet<>(new StudentComparator());
        s.add(new Student("liusan",20,90.0F));
        s.add(new Student("lisi",22,90.0F));
        s.add(new Student("wangwu",20,99.0F));
        s.add(new Student("sunliu",22,100.0F));
        for (Student st:s){
            System.out.println(st);
        }
    }
}
