package maratona.intro;

public class Aula05P2 {
    public static void main(String[] args) {
        int age = 18;
        String categoria;

        if (age >= 18) {
            categoria = "Categoria adulta";
        } else if (age >=15 && age < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria infantil";
        }
        System.out.println(categoria);
    }
}
