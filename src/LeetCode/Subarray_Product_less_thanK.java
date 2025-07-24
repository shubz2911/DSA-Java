package LeetCode;

public class Subarray_Product_less_thanK {
    public static void main(String[] args) {
        int [] arr={2,1,3,4,5,1,3,7,8,4,1};
        System.out.println(SubarrayProduct(arr,3));
    }
    public static int SubarrayProduct(int [] arr,int k){
        int sum=0;
        int ans;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        ans=sum;
        for(int j=k;j<arr.length;j++){
            sum+=arr[j];
            sum-=arr[j-k];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
