package day3;

public class product {
        int id; String name; double price;
        product(int id, String name, double price) {
            this.id=id; this.name=name; this.price=price;
        }
        public static void main(String[] args) {
            product p=new product(101,"laptop",55000);
            System.out.println(p.id+" "+p.name+" "+p.price );
        }
    }


