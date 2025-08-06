package CodeForces;
import java.util.Scanner;

public class Drinks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        double sum=0;
        double count=n;
        while(n>0){
            int a=sc.nextInt();
            sum+=a;
            n--;
        }
        double percentage=sum/count;
        System.out.println(percentage);
    }
}
