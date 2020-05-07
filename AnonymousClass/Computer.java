package itproger.JavaApp_v1;

public class Computer {
    class Processor{
        private boolean isStart = false;
        public  void start (){
            isStart = true;
            System.out.println("Processor is turned on.");
        }
        public  void shut_down (){
            isStart = false;
            System.out.println("Processor is turned off.");
        }
    }
    class ram{
        private boolean isStart = false;
        public  void start (){
            isStart = true;
            System.out.println("RAM is turned on.");
        }
        public  void shut_down (){
            isStart = false;
            System.out.println("RAM is turned off.");
        }
    }

    Processor i7 = new Processor();
    ram transfer = new ram();
}
