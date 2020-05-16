package itproger.JavaApp_v1;


public class Main {
    public static void main(String[] args){
        Array a = new MyArray();
        System.out.println(a.Add(3));
        System.out.println(a.Add(32));
        System.out.println(a.Add(34));
        System.out.println(a.Add(13));
        System.out.println(a.Get(1));

        Array b = new Array_2();
        System.out.println(b.Add(3));
        System.out.println(b.Add(32));
        System.out.println(b.Add(34));
        System.out.println(b.Add(13));
        System.out.println(b.Get(1));
    }
}
