package maratona.intro;
//outros jeitos de executar condicionais
public class Aula05P3 {
    public static void main(String[] args) {
    double wage = 7000;
        String tipMessage = "Eu vou dar 800 reais de gorjeta";
        String notTipMessage = "Eu não tenho condições para gorjeta";
        String result = wage > 5000 ? tipMessage : notTipMessage;

        System.out.println(result);
    }
}
