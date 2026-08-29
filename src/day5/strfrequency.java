package day5;
import java.util.HashMap;
public class strfrequency {
    public static void main(String[] args){
        String str="hello";
        HashMap<Character,Integer>frequency=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }
        System.out.println(frequency);
    }
}