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
