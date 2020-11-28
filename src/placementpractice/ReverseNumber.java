
package placementpractice;

import java.util.Scanner;

public class ReverseNumber {
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
        System.out.println(+rev+" is reverse of "+n);
    }
}
