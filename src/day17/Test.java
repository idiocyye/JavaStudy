package day17;

public class Test {
    public static void main(String[] args) {
        Musician musician=new Musician();
        Erhu erhu=new Erhu();
        Piano piano=new Piano();
        Violin violin=new Violin();
        musician.play(erhu);
        musician.play(piano);
        musician.play(violin);
    }
}
