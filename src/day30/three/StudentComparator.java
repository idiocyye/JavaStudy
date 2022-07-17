package day30.three;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.grade==o2.grade){
            return o1.age-o2.age;
        }
        return (int) (o2.grade-o1.grade);
    }
}
