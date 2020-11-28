
package placementpractice;

import java.util.Scanner;

public class GreatestAmong10Number {
    public static void main(String[] args) {
        int n,max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in the array: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        max = a[0];
        for(int i=0; i<n; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }
}
