import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int[] randArray = new int[10];
        int[] a = {1,5,6,2,4,8};
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = r.nextInt();
        }
        MergeSort.mergeSort(randArray,randArray.length);
        System.out.println(Arrays.toString(randArray));
        MergeSort.mergeSort(a,a.length);
        System.out.println(Arrays.toString(a));
        InsertionSort.insertionSort(a);
        System.out.println(Arrays.toString(a));
        InsertionSort.insertionSort(randArray);
        System.out.println(Arrays.toString(randArray));
    }
}
