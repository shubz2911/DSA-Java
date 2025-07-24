package LeetCode;


public class TrappingWater {
    public static void main(String[] args){
        int [] bars ={2,3,1,8,2,4,5};
        int [] left=new int[bars.length];
        int [] right=new int[bars.length];
        //Left maxima
        for(int i=1;i<bars.length;i++){
            left[0]=bars[0];
            left[i]=Math.max(bars[i],left[i-1]);
            //System.out.print(left[i]+",");
        }

        //right maxima
        for(int i=bars.length-2;i>0;i--){
            right[bars.length-1]=bars[bars.length-1];
            right[i]=Math.max(right[i+1],bars[i]);
            System.out.print(right[i]+",");
        }
    }
}
