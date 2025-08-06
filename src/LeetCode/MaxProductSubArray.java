package LeetCode;

public class MaxProductSubArray {
    public static void main(String[] args){
        int [] nums = {-2,0,-1};
        int product=Integer.MIN_VALUE;
        if(nums.length==1){
            if(nums[0]>product){
                product=nums[0];
            }
        }
        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=i;j<nums.length;j++){
                p*=nums[j];
                product=Math.max(product,p);
            }
        }
        System.out.println(product);
    }
}
