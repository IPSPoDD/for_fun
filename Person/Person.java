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
