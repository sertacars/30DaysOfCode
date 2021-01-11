import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
    public static void main(String[] args) {
        //english to spanish dictionary
        Map<String,String> englSpanDict = new HashMap<String,String>();

        //putting things inside dict
        englSpanDict.put("Monday","Lunes");
        englSpanDict.put("Tuesday","Martes");
        englSpanDict.put("Wednesday", "Miercoles");
        englSpanDict.put("Thursday", "Jueves");
        englSpanDict.put("Friday", "Viernes");

        //retrieve thigns from dict
        System.out.println(englSpanDict.get("Monday"));
        System.out.println(englSpanDict.get("Tuesday"));
        System.out.println(englSpanDict.get("Wednesday"));
        System.out.println(englSpanDict.get("Thursday"));
        System.out.println(englSpanDict.get("Friday"));

    }
}
