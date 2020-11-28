
package placementpractice;

import java.util.Scanner;

public class GCD_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number :");
        int num2 = sc.nextInt();
        while(num1 != num2){
            if(num1>num2){
                num1 = num1 - num2;
            }
            else{
                num2 = num2 - num1;
            }
        }
        System.out.println("GCD of two Number is : "+num2);
    }
}
