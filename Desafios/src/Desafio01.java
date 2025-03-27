import java.util.ArrayList;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<String>();

        while (true) {
            System.out.println("Digite seu nome:");
            Scanner entrada = new Scanner(System.in);
            nome.add(entrada.nextLine());

            System.out.println("Deseja continuar? [S/N]");
            Scanner continuar = new Scanner(System.in);
            if (continuar.next() .equals("N")) {
                break;
            }
        }
        int soma = 0;
        for (String i:nome) {
            soma += 1;
            System.out.println("O nome do paciente numero " + soma + " é " + i);
        }
    }
}
