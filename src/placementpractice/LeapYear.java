
package placementpractice;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year){
         if(year%4==0 || year%100==0 && year%400==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = sc.nextInt();
        if(isLeapYear(year)){
            System.out.println(year+" is Leap Year.");
        }else{
            System.out.println(year+" is not Leap Year.");
        }
    }
}
