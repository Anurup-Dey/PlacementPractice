
package placementpractice;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n){
        if(n<=0){
            return false;
        }
        for(int i=2;i < Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("The number is Prime.");
        }else{
            System.out.println("The number is not Prime.");
        }*/
        System.out.println(isPrime(5));
        System.out.println(isPrime(6));
        System.out.println(isPrime(7));
        System.out.println(isPrime(53));
        System.out.println(isPrime(57));
        System.out.println(isPrime(2));
    }
}
