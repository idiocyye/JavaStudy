package Algorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array={1,5,6,33,44,84,22,25,21,55,15,454,313,41,32};
        for (int arr:SelectionSort(array)){
            System.out.print(" "+arr);
        }
    }
    public static int[] SelectionSort(int[] array){
        for (int i=0;i<array.length;i++){
            int minIndex=i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                int temp=array[i];
                array[i]=array[minIndex];
                array[minIndex]=temp;
            }
        }
        return array;
    }
}
