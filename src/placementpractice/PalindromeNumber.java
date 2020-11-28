
package placementpractice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n,rev=0,temp,reminder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        temp = n;
        while(n>0){
          reminder = n%10;
          rev = rev*10 + reminder;
          n=n/10;
        }
        n = temp;
        if(n==rev){
            System.out.println(n+" is Palindrome.");
        }else{
            System.out.println(n+" is not Plaindrome.");
        }
    }
}
