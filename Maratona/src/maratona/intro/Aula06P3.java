package maratona.intro;

/**
 * imprime os 25 primeiros numeros de um numero (50)
 */
public class Aula06P3 {
    public static void main(String[] args) {
        int maxValue = 50;
        for (int num = 0;num<=maxValue;num++) {
            System.out.println(num);
            if (num >= 25) {
                break;
            }
        }
    }
}
