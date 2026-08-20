package Day3;
import java.util.Scanner;
public class trycatchbasics {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter numerator");
            int a=sc.nextInt();
            System.out.println("enter denominator");
            int b=sc.nextInt();
            int result=(a/b);
            System.out.println("result"+result);
        }catch(ArithmeticException e)
        {
            System.out.println("error:cannot divide by zero");
        }
    }

}