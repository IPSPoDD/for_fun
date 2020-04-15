package itproger.JavaApp_v1;


public class Main {

    public static void main(String[] args) {
        Person vitya = new Person();
        System.out.println("Vitya: " + vitya.height);
        Person vlad = new Person(150, "Vlad");
        //vlad.height = 120;
        System.out.println("Vlad: " + vlad.height);
        vitya.say("George");
        System.out.println("Hello, "+ vlad.name+"! "+ "Your height is " + vlad.height + " kg.");
        Person dima = new Person("Dima");
        System.out.println("Hello, "+ dima.name+"! "+ "Your height is " + dima.height + " kg.");
        //
        System.out.println("====");
        Student oleg = new Student(170, "Oleg", 4);
        System.out.println(oleg.course);
        System.out.println("====");
        oleg.tell();
    }
}

______________________

package itproger.JavaApp_v1;

public class Person {
    public int height = 9999;
    public String name = "Unknown";

    public void say(String name){
        System.out.println("Hello, " + name);
    }

    public Person(int h, String n){
        height = h;
        name = n;
    }

    public Person(){
    }
    public Person(String n){
        name = n;
    }
}


______________________

package itproger.JavaApp_v1;

public class Student extends Person{
    int course = 1;

    void tell(){
        System.out.println(super.height);
        System.out.println(super.name);
        System.out.println(course);
    }

    public Student(int h, String n, int course){
       super(h, n);
       this.course = course;
    }

}




