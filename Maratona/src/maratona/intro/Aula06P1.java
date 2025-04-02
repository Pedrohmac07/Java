package maratona.intro;

/**
 * Estruturas de repetições (while, do while, for)
 */
public class Aula06P1 {
    public static void main(String[] args) {
        int count = 0;
        int count2;
        int count3 = 0;

        while (count < 10) {
            System.out.println("Estrutura de repetição while: "+count);
            count +=1;
        }

        do {
            count3 += 1;
            System.out.println("Estrutura de repetição do_while: "+count3);
        }while ( count3 < 10);

        for (count2 = 0; count2 < 10; count2++) {
            System.out.println("Estrutura de repetição for: "+count2);
        }
    }
}
