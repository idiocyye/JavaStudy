package day14;

public class Wife {
    String  idCard;
    String name;
    String  birthDate;
    Husband husband;

    public Wife(String  idCard, String name, String  birthDate,  Husband husband) {
        this.idCard = idCard;
        this.name = name;
        this.birthDate = birthDate;
        this.husband = husband;
    }

    public Wife() {
    }
}
