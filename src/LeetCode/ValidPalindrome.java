package LeetCode;

public class ValidPalindrome {
    public static void main(String[] args){
            String a="A man, a plan, a canal: Panama";
            System.out.println(isPalindrome(a));
    }

    public static boolean isPalindrome(String s){
        boolean a=true;
        StringBuilder b1=new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                char ch=s.charAt(i);
                b1.append(ch);
            }
            else if(s.charAt(i)>=48 && s.charAt(i)<=47){
                char ch=s.charAt(i);
                b1.append(ch);
            }
        }
        int k=b1.length()-1;
        int j=0;
        while(j<k){
            if(b1.charAt(j)!=b1.charAt(k)){
                a=false;
            }
            j++;
            k--;
        }
        return a;
    }
}
