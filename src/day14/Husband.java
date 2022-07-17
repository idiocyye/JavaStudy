package day14;

public class Husband {
    String  idCard ;
    String name;
    String  birthDate;
    Wife wife;
    public Husband(String  idCard, String name, String  birthDate, Wife wife) {
        this.idCard = idCard;
        this.name = name;
        this.birthDate = birthDate;
        this.wife = wife;
    }
    public Husband() {
    }
}
