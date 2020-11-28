
package placementpractice;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
       int num,i=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Decimal Number :");
       num = sc.nextInt();
       int[] binary = new int[100];
       if(num==0){
           System.out.println("Binary value is :"+num);
       }else{
           while(num > 0){
           binary[i] = num%2;
           num = num/2;
           i++;
       }
        System.out.print("Binary value is :");
        for(int j=i-1;j>=0;j--){
            System.out.print(""+binary[j]); 
        }
       }
       System.out.println();
    }
}
