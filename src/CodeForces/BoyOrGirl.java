package CodeForces;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
//        int n=str.length();
//        int count=0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(str.charAt(i)==str.charAt(j)){
//                    count++;
//                }
//            }
//        }
//        if((n-count)%2==0){
//            System.out.println("CHAT WITH HER!");
//        }
//        else{
//            System.out.println("IGNORE HIM!");
//        }

        Set<Character> ll=new HashSet<>();
        for(int i=0;i<str.length();i++){
            ll.add(str.charAt(i));
        }

        if(ll.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
