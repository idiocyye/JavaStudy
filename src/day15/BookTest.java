package day15;

public class BookTest {
    public static void main(String[] args) {
        Book book3=new Book();
        book3.detail();

        Book book1=new Book("陈巧怡是猪猪",90);
        book1.detail();
        Book book2=new Book("田江涛是养猪员",520);
        book2.detail();

        book2.setTitle("田江涛是养猪员吗");
        System.out.println(book2.getTitle());
        book2.detail();
        book1.setPageNum(520);
        System.out.println(book1.getPageNum());
        book1.detail();
    }
}
