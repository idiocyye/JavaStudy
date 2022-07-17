package day32;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1879630282478773286L;
    int no;
    String name;
    String birthday;
    String sex;
    String mail;

    public Student() {
    }

    public Student(int no, String name, String birthday, String sex, String mail) {
        this.no = no;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.mail = mail;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
