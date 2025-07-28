package LeetCode;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int [] arr={3,2,4};
        int t=6;
        System.out.println(Arrays.toString(twoSum(arr,t)));
        }

    public static int [] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
           int complement=target-nums[i];
           if(map.containsKey(complement)){
               return new int [] {map.get(complement),i};
           }
           map.put(nums[i],i);
       }
       return new int [] {};
    }

}
