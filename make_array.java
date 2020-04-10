package itproger.JavaApp_v1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("How long will be yur array?");
        n = in.nextInt();
        a = new int[n];
        for (int i = 0; i<n; i++) {
            System.out.println("Enter a [" + i + "] =");
            a[i] = in.nextInt();
        }
    }
}
