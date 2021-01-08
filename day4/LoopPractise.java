package day4;

public class LoopPractise {

    public static void practiseWhileLoop(){
        int x = 0;
        while(x < 5){
            System.out.println("The value of x is :" + x);
            x++;
        }
    }

    public static void practiceDoWhileLoop(){
        int x = 0;
        do {
            System.out.println("The value of x is :" + x);
            x++;
        }while (x<10);
    }

    public static void practiseForLoop(){
        for (int x=0 ; x<20; x++){
            System.out.println("The value of x is: " + x);
        }
    }

    public static void main(String[] args) {
        //practiseWhileLoop();
        //practiceDoWhileLoop();
        practiseForLoop();
    }
}