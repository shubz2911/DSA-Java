package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args){
        int [] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int sum=0;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(nums[j]==nums[j-1] && j<k){
                        j++;
                    }
                    while(nums[k]==nums[k+1] && j<k){
                        k--;
                    }
                    }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        System.out.println(ans);
    }
}
