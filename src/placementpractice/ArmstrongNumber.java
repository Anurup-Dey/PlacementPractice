
package placementpractice;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int result=0,reminder,temp;
        int n = 153;
        temp = n;
        while(n>0){
            reminder = temp%10;
            result = result + (int)Math.pow(reminder,3);
            temp = temp/10;
        }
        if(result==n){
            System.out.println(n+" number is Armstrong.");
        }
        else{
            System.out.println(n+" number is not Armstrong.");
        }
    }
}
