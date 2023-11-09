import java.util.Locale;

public class ExercioPrint {
    public static void main(String[] args) throws Exception {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'm';

        double price1 = 10.000;
        double price2 = 10.123456;
        double measure = 53.234567;

        System.out.printf("%s, wich price is $ %.2f%n", product1, price1);
        System.out.printf("%s, wich price is $ %.2f%n", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
        
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
    
    
}
