public class RecursionExercise {

    // f(f(f(a))) = ?
    // f(a) = 5 + a
    // a=20 --> f(20) = 25
    // f(f(f(20))) = f(f(25)) = f(30) = 35

    // summation of 5 = 5+4+3+2+1;

    public static int Summation (int n) {
        // base case : we are at the end
        if (n <= 0){
            return 0;
        }
        // recursive case : keep going
        else {
            return n +  Summation(n-1);
        }

    }





    public static void main(String[] args) {

        System.out.println(Summation(3));
    }
}
