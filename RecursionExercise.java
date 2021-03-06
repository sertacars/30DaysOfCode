public class RecursionExercise {

    // f(f(f(a))) = ?
    // f(a) = 5 + a
    // a=20 --> f(20) = 25
    // f(f(f(20))) = f(f(25)) = f(30) = 35

    // summation of 5 = 5+4+3+2+1;

    public static int Summation (int n) {
        // base case : we are at the end
        if (n <= 0){
            return 0; //additive identity property
        }
        // recursive case : keep going
        else {
            return n + Summation(n-1);
        }

    }

    public static int Factorial(int n){
        // base case
        if (n <= 1){
            return 1;
        }
        // recursive case
        else {
            return n * Factorial(n-1);
        }
    }

    public static int Exponentiation(int n, int p){
        // base case
        if (p <= 0) {
            return 1;
        }
        // recursive base
        else {
            return n * Exponentiation(n, p-1);
        }
    }



    public static void main(String[] args) {

        System.out.println(Summation(3));
        System.out.println(Factorial(4));
        System.out.println(Exponentiation(5, 3));
    }
}
