package LeetCode;

public class Maximun_Subarray {
    public static void main(String[] args) {
        int [] arr={2,3,-7,11,-1,3};
        maxSubArray(arr);
    }

    public static void maxSubArray(int [] arr){
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                ans=Math.max(ans,sum);
                if(sum<=0){
                    sum=0;
                }
            }
        }
        System.out.println(ans);
    }
}
