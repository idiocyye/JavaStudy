package Algorithm;

public class InsertSort {
    public static void main(String[] args) {
        int[] array={1,5,6,33,44,84,22,25,21,55,15,454,313,41,32};
        for (int arr:insertSort(array)){
            System.out.print(arr+" ");
        }
    }
    public static int [] insertSort(int[] array){
        for (int i=1;i<array.length;i++){
            int preIndex=i-1;
            int current=array[i];
            while (preIndex>=0&&current<array[preIndex]){
                array[preIndex+1]=array[preIndex];
                preIndex--;
            }
            array[preIndex+1]=current;
        }
        return array;
    }
}
