package CodeForces;
import java.util.Scanner;
public class Dubstep {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s="WUB";
        String newStr=str.replace(s," ");
        newStr=newStr.trim();
        System.out.println(newStr);
    }
}
