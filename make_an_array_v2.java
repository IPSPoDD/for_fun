package itproger.JavaApp_v1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        readArray();
    }

    public static int[] readArray(){
        int [] arr;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("How long will be an array? ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Array[" + i + "]");
            arr[i] = in.nextInt();
        }
        return arr;
    }
}
