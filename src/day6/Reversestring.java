package day6;

public class Reversestring {
    static String reverse(String str){
        if(str.length()==0){
            return"";
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args){
        String str="java";

        System.out.println("reverse="+reverse(str));
    }
}