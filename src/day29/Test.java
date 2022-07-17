package day29;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        try {
            myLinkedList.add(13);
            myLinkedList.add(14);
            myLinkedList.add(15);
            myLinkedList.add(16);
            myLinkedList.add(13);
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }
        myLinkedList.display();


        System.out.println("==============");
        try {
            myLinkedList.remove(13);
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }
        myLinkedList.display();


        System.out.println("==============");
        try {
            myLinkedList.remove(19);
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }
        myLinkedList.display();

        System.out.println("==============");
        try {
            myLinkedList.modify(19,45);
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }
        myLinkedList.display();
        System.out.println("==============");
        try {
            myLinkedList.modify(14,45);
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }
        myLinkedList.display();
        System.out.println("==============");
        try {
            myLinkedList.find(5);
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }
        myLinkedList.display();
    }
}
