package day30.three;

import java.util.Objects;

/**
 * 3.分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，如果成绩一样，
 * 那在成绩排序的基础上按照年龄由小到大排序。
 *
 * 姓名（String）年龄（int）分数（float）
 * liusan			20				90.0F
 * lisi				22				90.0F
 * wangwu			20				99.0F
 * sunliu			22				100.0F
 *
 * 编写一个Student类用来实现Comparable<Student>接口,并在其中重写CompareTo(Student o)方法　
 * 在主函数中使用Comparable 与 Comparetor分别对ArrayList进行排序.
 */
public class Student implements Comparable<Student>{
    String name;
    int age;
    float grade;

    public Student() {
    }

    public Student(String name, int age, float grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Float.compare(student.grade, grade) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
       if (this.grade==o.grade){
           return this.age-o.age;
       }
       return (int) (o.grade-this.grade);
    }
}
