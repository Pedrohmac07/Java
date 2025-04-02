package maratona.intro;

/**
 * Operadores
 */
public class Aula04 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int add = num1 + num2;
        int subtract = num2 - num1;
        int multiply = num1 * num2;
        int divide = num2 / num1;

        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);

        // > < <= >= == !=
        boolean isBigger = num1 > num2;
        boolean isEqual = num1 == num2;
        boolean isLower = num1 < num2;
        System.out.println("O valor é maior:"+isBigger);
        System.out.println("O valor é igual:"+isEqual);
        System.out.println("O valor é menor:"+isLower);

        // && (and) || (or)
        int age = 18;
        boolean isLegalAge = age >= 18 && isLower;
        boolean isBiggerOrLess = isBigger || isLower;

        System.out.println("Você é de maior:"+isLegalAge);
        System.out.println("o valor é maior ou igual:"+isBiggerOrLess);

        // = += -= *= /= %= tambem pode ser utilizado em Java...
    }
}
