package day6;

public class Factorialrecursion {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[]args){
        int n=5;
        System.out.println("factorial="+factorial(n));
    }
}