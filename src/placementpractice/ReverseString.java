
package placementpractice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String s,rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = sc.nextLine();
        for(int i = s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println("reverse :"+rev);
    }
}
