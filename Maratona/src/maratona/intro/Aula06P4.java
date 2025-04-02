package maratona.intro;

/**
 * Dado o valor de um carro, descubra quantas vezes pode ser parcelado
 * o valor da parcela deve ser maior que 1000
 */
public class Aula06P4 {
    public static void main(String[] args) {
        double minQuota = 1000;
        double carValue = 50000;
        float quota;

        for (quota = 1;quota < 100;quota++) {
            if (carValue / quota < minQuota) {
                quota -= 1;
                break;
            }
        }
        System.out.println("Você pode parcelar em até: "+quota);
    }
}
