package CodeForces;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int count = 0;
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == a.charAt(i + 1)) {
                count++;
            }
            else{
                count=0;
            }
            if(count>=6){
                System.out.println("YES");
                return;
            }
        }
            System.out.println("NO");
    }
}
