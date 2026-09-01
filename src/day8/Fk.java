package DAY09;
import java.util.*;
class items{

    int weight;
    int value;
    items(int weight,int value){
        this.weight=weight;
        this.value=value;
    }
}
public class Fk {

    public static void main(String[] args){

        items[] items={
                new items(10,60),
                new items(20,100),
                new items(30,120)
        };

        int capacity=50;

        Arrays.sort(
                items,
                (a,b)->
                        Double.compare(
                                (double)b.value/b.weight,
                                (double)a.value/b.weight
                        )
        );

        double totalValue=0;

        for(items item: items){

            if(capacity>=item.weight){

                capacity-=item.weight;
                totalValue+=item.value;

            }else{

                totalValue+=
                        ((double) item.value/item.weight)
                                *capacity;

                break;
            }
        }
        System.out.println(
                "Maximum value = "+totalValue
        );

    }
}