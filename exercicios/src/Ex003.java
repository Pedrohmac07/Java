import java.util.ArrayList;

public class Ex003 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();

        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Pitaya");
        frutas.add("Abacate");
        frutas.add("Melancia");

        frutas.remove("Pitaya");
        boolean temPitaya = frutas.contains("Pitaya");
        boolean temBanana = frutas.contains("Banana");

        for (String n:frutas) {
            System.out.println(n + " ");
        }

        System.out.println(frutas);
        System.out.println("Tem pitaya? " + temPitaya + " Tem banana? " + temBanana);
    }
}
