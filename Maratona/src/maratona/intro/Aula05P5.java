package maratona.intro;

/**
 * Switch tambem é uma condicional
 */
public class Aula05P5 {
    public static void main(String[] args) {
        byte day = 8;
        // switch só le (char, int, byte, short, enum, string
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida tente novamente");
        }
    }
}
