import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {


    int theNumber;
    int max;

    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber(){
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt()) % (max+1);
    }

    public void play() {
        while(true){
            int move = scanner.nextInt();
            if (move > theNumber){
                System.out.println("Your number is too big");
            }
            else if (move < theNumber){
                System.out.println("Your number is too small");
            }
            else{
                System.out.println("You got it!!!!!!");
                break;
            }
        }

    }


    public static void howBigIsMyNumber(int x) {
        if (x>=0 && x<=10){
            System.out.println("Number is pretty small");
        }
        else if (x>=11 && x<=100){
            System.out.println("Number is pretty big");
        }
        else {
            System.out.println("Number is out of range");
        }
    }
    public static void main(String[] args) {

        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Welcome! Try and guess the number " + "Its between 0 and " + guessGame.max);
        guessGame.play();
        
    }
}
