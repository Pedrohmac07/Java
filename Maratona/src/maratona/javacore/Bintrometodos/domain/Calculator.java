package maratona.javacore.Bintrometodos.domain;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(10 - 10);
    }

    public void multiplyTwoNumbers(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public double divideTwoNumbers(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }

    public void changeTwoNumber(int n1, int n2) {
        n1 = 99;
        n2 = 33;
        System.out.println("Alterando numeros...");
        System.out.println("n1 = " + n1 + ", n2 = " + n2);
    }

    public void sumArray(int[] nums) {
        int sum = 0;
        for (int num:nums) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumArrayArgs(int... nums) {
        int sum = 0;
        for (int num:nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
