public class GuessTheNumber {

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

        howBigIsMyNumber(0);
        howBigIsMyNumber(10);
        howBigIsMyNumber(100);
        howBigIsMyNumber(20);
        howBigIsMyNumber(11);
        howBigIsMyNumber(5);
        howBigIsMyNumber(750);
        howBigIsMyNumber(-2);
        
    }
}
