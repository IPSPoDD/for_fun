package geekbrains.lesson_2.guess_the_number;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ваша задача угадать число.");
        //System.out.println("Поставьте лимит.");
        //int range = scanner.nextInt();
        int range = 30; // new Random().nextInt();
        int number = (int)(Math.random() * range);
        playLevel(range, number);
        scanner.close();
    }
    private static void playLevel(int range, int number){
        while(true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали!");
                break;
            } else if (input_number >= number) {
                System.out.println("Загаданное число меньше!");
            } else {
                System.out.println("Загаданное число больше!");
            }
        }
    }
}
