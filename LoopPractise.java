
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
        for (int x=0 ; x<10; x++){
            for (int y=0; y<10; y++){
                System.out.println("("+x+","+y+")");
            }
        }
    }

    public static void main(String[] args) {
        //practiseWhileLoop();
        //practiceDoWhileLoop();
        practiseForLoop();
    }
}