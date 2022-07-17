package day29;

import java.util.Objects;

/**
 * 编写程序实现单向链表数据结构：
 * 	public class Node {
 * 		Object data;
 * 		Node next;
 *        }
 * 	public class MyLinkedList{
 * 		Node header;
 * 		....
 * 		// 添加数据的方法
 * 		// 删除数据的方法
 * 		// 修改数据的方法
 * 		// 查找数据的方法
 * 		// 打印集合中每个元素的方法
 *    }
 *
 * 	最后编写测试程序
 */
public class Node {
    //数据
    Object data;
    //下一节点地址
    Node next;

    public Node() {
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(data, node.data) &&
                Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

