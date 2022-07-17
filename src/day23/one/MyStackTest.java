package day23.one;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack=new MyStack(new Object[5],-1);
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();


    }
}
