package maratona.intro;
//imposto na Holanda
public class Aula05P4 {
    public static void main(String[] args) {
        double wage = 25000;
        double lowWageTax = 9.70 / 100;
        double midWageTax = 37.35 / 100;
        double highWageTax = 49.50 / 100;
        double result;

        if (wage >= 68508) {
            result = wage * highWageTax;
        }
        else if (wage < 68508 && wage >= 34713) {
            result = wage * midWageTax;
        }
        else {
            result = wage * lowWageTax;
        }
        System.out.println("Você tem de pagar de imposto:"+result);
    }
}
