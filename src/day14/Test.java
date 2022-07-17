package day14;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test {
    public static void main(String[] args) {
        Husband husband=new Husband("513902200010245695","田江涛","2000-10-24",null);
        Wife wife=new Wife("513902520520520","陈巧怡","2000-07-23",null);
        husband.wife=wife;
        wife.husband=husband;
        System.out.println(husband.name+"的妻子是"+wife.name);
        System.out.println("陈巧怡丈夫生日是"+wife.husband.birthDate);
    }
}
