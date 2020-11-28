
package placementpractice;

public class Swap {
    public static void main(String[] args) {
        int n1=5,n2=7;
        System.out.println("Before Swaping :"+n1+" "+n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("After Swaping :"+n1+" "+n2);
    }
}
