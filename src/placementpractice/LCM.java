//Java program to find LCM of two numbers
import java.util.Scanner;
public class LCM
{
	public static void main(String[] args)
	{
            int num1,num2;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st Number : ");
            num1 = sc.nextInt();
            System.out.print("Enter 2nd Number : ");
            num2 = sc.nextInt();
            int a = (num1 > num2) ? num1 : num2;
            int i;
            for(i = a;i < (num1*num2); i=i+a){
                if(num1%i==0 && num2%i==0)
                    break;
            }
            System.out.println("LCM of "+num1+" and "+num2+" is : "+i);
            sc.close();									
	}
}