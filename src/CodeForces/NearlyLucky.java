package CodeForces;

import java.util.Scanner;

public class NearlyLucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();  // handle numbers up to 10^18 safely
        int count = 0;

        // Count lucky digits
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == '4' || ch == '7') {
                count++;
            }
        }

        // Check if the count itself is lucky
        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

