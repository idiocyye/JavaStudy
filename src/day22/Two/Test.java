package day22.Two;

public class Test {
    public static void main(String[] args) {
        UseCompute useCompute=new UseCompute();
        useCompute.useCom(new Add(),6,3);
        useCompute.useCom(new Sub(),5,3);
        useCompute.useCom(new Multiplication(),2,3);
        useCompute.useCom(new Division(),8,6);
    }
}
