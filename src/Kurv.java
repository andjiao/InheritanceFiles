import java.util.ArrayList;
import java.util.Scanner;

public class Kurv {
    public static void main(String[] args) {

        Dress d1 = new Dress("Mango. ", 39, "Kælang. ","Fest.");
        Dress d2 = new Dress("Vero Moda", 34,"ekstra kort","Fest");
        Dress d3 = new Dress("H&M",38, "Lang", "Hverdagskjole");
        Dress d4 = new Dress("Gucci", 44, "Lårkort", "Cocktailparty");

        ArrayList<Dress> basket = new ArrayList<>();

        basket.add(d1);
        basket.add(d2);
        basket.add(d3);
        basket.add(d4);

        System.out.println("Der er nu " + basket.size() + " stk. tøj i din kurv ");

    }
}
