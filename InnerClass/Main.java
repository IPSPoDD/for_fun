package itproger.JavaApp_v1;


public class Main {

    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.i7.start();
        comp.transfer.start();
        comp.i7.shut_down();
        }
    }
