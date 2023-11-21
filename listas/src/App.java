import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        List<String> lista = new ArrayList<String>();
        lista.add("Ola");
        lista.add("Mundo"); 

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
    }
}

