package maratona.intro;

/**
 * Estruturas condicionais {if}
 */
public class Aula05P1 {
    public static void main(String[] args) {
        float num1 = 20;
        float num2 = 10;
        float num3 = 30;

        if (num2 > num1 && num3 > num2 || num3 > num1) {
            System.out.println("If was executed");
        }
        else {
            System.out.println("Else was executed");
        }
    }
}
