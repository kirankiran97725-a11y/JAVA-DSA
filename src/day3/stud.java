package day3;

public class stud {
    String name;
    stud(String name) {this.name=name;}
    void display(){System.out.println("The student name is "+ this.name);}


    public static void main(String[] args)
    {
        new stud("Hari").display();
    }
}

