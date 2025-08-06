package LeetCode;

public class TwoSumII {
    public static void main(String[] args){
        int [] numbers = {2,7,11,15};
        int target = 6;
//        int [] ans =new int[2];
//        for(int i=0;i<numbers.length;i++){
//            int diff=target-numbers[i];
//            for(int j=i+1;j<numbers.length;j++){
//                if(numbers[j]==diff){
//                    ans[0]=i+1;
//                    ans[1]=j+1;
//                    break;
//                }
//            }
//        }
//        int k=0;
//        while(k<2){
//            System.out.print(ans[k]);
//            k++;
//        }

        for(int i=0;i<2;i++){
            int [] arr=sum(numbers,target);
            System.out.println(arr[i]);
        }

    }

    //Optimised Approach
    public static int [] sum(int [] numbers,int target){
        int n=numbers.length;
        int i=0;
        int j=n-1;
        int sum=0;;
        while(i<j){
            sum+=numbers[i]+numbers[j];
            if(sum==target){
                return new int [] {i+1,j+1};
            }
            if(sum>target){
                j--;
                sum=0;
            }
            else{
                i++;
                sum=0;
            }
        }
        return new int [] {i+1,j+1};
    }
}
