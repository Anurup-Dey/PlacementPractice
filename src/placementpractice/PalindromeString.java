
package placementpractice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String s,rev="",temp="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = sc.nextLine().trim();
        temp = s;
        for(int i = s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        s = temp;
        if(s.equals(rev)){
            System.out.println(s+" is Palindrome.");
        }else{
            System.out.println(s+" is not a Palindrome.");
        }
    }
}
