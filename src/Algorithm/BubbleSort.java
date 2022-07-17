package Algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array={1,5,6,33,44,84,22,25,21,55,15,454,313,41,32};
        for (int arr:bubbleSort(array)){
            System.out.print(" "+arr);
        }
    }
    public static int[] bubbleSort(int[] array){
        for (int i=1;i<array.length;i++){
            boolean flag=true;
            for (int j=0;j<array.length-i;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=false;
                }
            }
            if (flag){
                break;
            }
        }
        return array;
    }
}
