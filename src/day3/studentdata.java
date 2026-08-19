package day3;

public class studentdata {
        String name;
        int age;

        public studentdata(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public static void main(String[] args) {
            studentdata d1 = new studentdata("Virat", 25);
            System.out.println("The Name of Student is " + d1.name);
            System.out.println("The Age of Student is " + d1.age);

            studentdata d2 = new studentdata("Rohit", 30);
            System.out.println("The Name of Student is " + d2.name);
            System.out.println("The Age of Student is " + d2.age);
        }
    }


