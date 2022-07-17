package day15;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student("四川成都","641408");
        student.getPostAddress();
        student.setAddress("北京");
        System.out.println(student.getAddress());

    }
}
