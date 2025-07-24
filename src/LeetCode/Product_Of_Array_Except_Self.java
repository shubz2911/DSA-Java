package LeetCode;

public class Product_Of_Array_Except_Self {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        product(arr);
    }

    public static void product(int [] arr){
        int n=arr.length;
        int [] left=new int[n];
        left[0]=1;
        for(int i= 1;i<n;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        int [] right=new int[n];
        right[n-1]=1;
        for(int j=n-2;j>=0;j--){
            right[j]=right[j+1]*arr[j+1];
        }

        int [] product=new int[n];
        for(int k=0;k<n;k++){
            product[k]=right[k]*left[k];
            System.out.print(product[k]+" ");
        }

    }
}
