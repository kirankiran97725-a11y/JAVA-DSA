package day5;

class palindromcheck {
    public static void main(String[]args){
        String str="abi";
        int left=0;
        int right=str.length()-1;
        boolean ispalindrome=true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                ispalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(ispalindrome){
            System.out.println(str+" is a palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}