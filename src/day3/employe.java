package day3;

public class employe {
        String name;
        int age;
        employe(){this("unknown",0);}
        employe(String name){this(name,0);}
        employe(String name,int age){
            this.name=name;
            this.age=age;
        }
        public static void main(String[]args){
            employe a=new employe();
            employe b=new employe("rahul");
            employe c=new employe("priya",21);
            System.out.println(a.name+" "+a.age);
            System.out.println(b.name+" "+b.age);
            System.out.println(c.name+" "+c.age);
        }
    }

