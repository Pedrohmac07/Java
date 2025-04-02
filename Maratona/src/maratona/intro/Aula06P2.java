package maratona.intro;

/**
 * Imprima todos os numeros pares de 0 até 1 milhão (1.000.000)
 */
public class Aula06P2 {
    public static void main(String[] args) {
        int num;

        for (num = 0;num<=1000000;num++) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
