import java.util.Random;

public class CoinToss {

    public int tossACoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        return toss;
    }

    public static void public static void main(String[] args) {
        
    }
}
