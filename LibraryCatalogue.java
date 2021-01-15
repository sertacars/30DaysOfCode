import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    // properties, fields, global variables
    Map<String,Book> bookCollection = new HashMap<String,Book>();
    int currentDay = 0;
    int lengthOfCheckedOutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public LibraryCatalogue(Map<String,Book> collection){
        this.bookCollection = collection;
    }

    public LibraryCatalogue(Map<String,Book> collection, int lengthOfCheckedOutPeriod, double initialLateFee, double feePerLateDay){
        this.bookCollection = collection;
        this.lengthOfCheckedOutPeriod = lengthOfCheckedOutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }
    public static void main(String[] args) {
        
    }
}