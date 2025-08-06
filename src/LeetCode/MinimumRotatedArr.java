package LeetCode;

public class MinimumRotatedArr {
    public static void main(String[] args){
        int [] nums = {4,5,6,7,0,1,2};
        int rotate=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                rotate=i;
                System.out.println(nums[rotate]);
                break;
            }
        }
        if(rotate==0){
            System.out.println(nums[0]);
        }
    }
}
