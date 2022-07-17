package day23.one;

/**
 * 编写程序，使用一维数组，模拟栈数据结构。
 * 	要求：
 * 		1、这个栈可以存储java中的任何引用类型的数据。
 * 		2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。）
 * 		3、在栈中提供pop方法模拟弹栈。（栈空了，也有有提示信息。）
 * 		4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
 */
public class MyStack {
    private Object[] data;
    private int index;

    public MyStack() {
    }

    public MyStack(Object[] data, int index) {
        this.data = data;
        this.index = index;
    }

    public Object[] getData() {
        return data;
    }

    public void setData(Object[] data) {
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    //压栈
    public void push(Object object){
        if (index>=data.length-1){
            System.out.println("栈已经满了，压栈失败");
            return;
        }
        index++;
        data[index]=object;
        System.out.println("压栈成功，栈帧指向"+index);
    }
    //弹栈
    public void pop(){
        if (index<0){
            System.out.println("栈已经空了，弹栈失败");
            return;
        }
        System.out.print("弹栈"+data[index]+"成功");
        index--;
        System.out.println("栈帧指向"+index);
    }
}
