package LeetCode;

import java.util.PriorityQueue;

public class KthLargestEle {
    public static void main(String[] args){
        int [] nums = {3,2,1,5,6,4};
        int k = 2;
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            if(pq.size()<k){
                pq.add(nums[i]);
            }
            else if(pq.peek()<nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        System.out.println(pq.peek());
    }
}
