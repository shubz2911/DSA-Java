package LeetCode;

public class NextPermutation {
    public static void main(String[] args) {
        int [] arr={1,3,2};
        Permutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Permutation(int [] arr) {
        int lenght = arr.length;
        if (lenght > 1) {
            //Finding Pivot
            int pivot = 0;
            int max=0;
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] < arr[i + 1]) {
                    pivot = i;
                    break;
                }
            }
            //Swaping
            int min = pivot + 1;
            for (int j = min; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[pivot];
            arr[pivot] = arr[min];
            arr[min] = temp;

            if (pivot != max) {
                //Reversing
                int n = arr.length - 1;
                for (int k = pivot + 1; k <= (pivot + n) / 2; k++) {
                    int temp2 = arr[n];
                    arr[n] = arr[k];
                    arr[k] = temp2;
                }
            }
        }
    }
}
