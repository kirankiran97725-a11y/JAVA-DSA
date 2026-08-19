package day3;

public class product {

        String name;
        int id;
        int price;

        product(String name, int id, int price) {
            this.name = name;
            this.id = id;
            this.price = price;
        }

        public static void main(String[] args) {

            product p1 = new product("Laptop", 101, 50000);

            System.out.println("Product name is " + p1.name);
            System.out.println("Product id is " + p1.id);
            System.out.println("Product price is " + p1.price);

            product p2 = new product("Mobile", 102, 20000);

            System.out.println("Product name is " + p2.name);
            System.out.println("Product id is " + p2.id);
            System.out.println("Product price is " + p2.price);
        }
    }

