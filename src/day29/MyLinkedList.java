package day29;

public class MyLinkedList{
    Node header=new Node(0,null);
    // 添加数据的方法
    public void add(Object data) throws MyLinkedListException {
        Node temp=header;
        while (true){
            if (temp.next==null){
                break;
            }
            temp=temp.next;
        }
        if (temp.data!=data){
            temp.next=new Node(data,null);
            return;
        }
        throw new MyLinkedListException("链表中已经有此元素!");
    }
    //显示链表
    public void display(){
        if (header.next==null){
            System.out.println("空链表");
            return;
        }
        Node temp=header.next;
        while (true){
            if (temp==null){
                break;
            }
            System.out.println(temp);
            temp=temp.next;
        }
    }
    // 删除数据的方法
    //node 要删除的节点
    public void remove(Object data) throws MyLinkedListException {
        Node temp=header;
        while (temp.next!=null){
            if (temp.next.data.equals(data)){
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
        throw new MyLinkedListException("链表中不存在此节点");
    }
    // 修改数据的方法
    public void modify(Object oldData,Object newData) throws MyLinkedListException {
        Node temp=header;
        while (temp.next!=null){
            if (temp.next.data.equals(oldData)){
                temp.next.data=newData;
                return;
            }
            temp=temp.next;
        }
        throw new MyLinkedListException("链表中不存在此节点");
    }
    // 查找数据的方法
    public void find(Object data) throws MyLinkedListException {
        Node temp=header;
        while (temp.next!=null){
            if (temp.next.data.equals(data)){
                System.out.println("找到了"+data);
                return ;
            }
            temp=temp.next;
        }
        throw new MyLinkedListException("链表中不存在此节点");
    }
    // 打印集合中每个元素的方法
    public void print(){

    }
}
