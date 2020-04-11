package itproger.JavaApp_v1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Number: ");
        int a = n.nextInt();
        System.out.println("Power: ");
        int b = n.nextInt();
        int t = f(a,b);
        System.out.println(t);
    }
    public static int f (int a, int b){
        int result = 1;
        for (int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }
}
