package day6;

public class Bubblesort {
    public static void main(String[] args){
        int[]num={5,3,8,1,2};
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.print("sorted");
        for(int numb:num){
            System.out.print(numb+ "");

        }
    }

}