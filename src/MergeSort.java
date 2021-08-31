
/* 1. Merge sort uses same amount iterations, regardless target array is partially sorted or not.
Insertion sort is more effective in this way. When array is sorted or partially sorted, insertion sort has linear complexity O(n) in best case, average is O(n^2), space complexity O(1);
   2. Merge sort needs more memory for implementation, because it uses several created arrays, that will allocate some memory inside heap;
   Time complexity O(nLogn) in all cases. Space complexity O(n).
*/
public class MergeSort {

    public static void mergeSort(int[] a, int n){
        if(n < 2){
            return;
        }
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n-mid);
        merge(a,l,r,mid,n-mid);
    }

    private static void merge(int[] a, int[] l, int[] r, int left, int right){
        int i=0, j=0, k=0;

        while(i < left && j < right){
            if(l[i] < r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }
        while(i < left){
            a[k++] = l[i++];
        }
        while(j < right){
            a[k++] = r[j++];
        }
    }
}
