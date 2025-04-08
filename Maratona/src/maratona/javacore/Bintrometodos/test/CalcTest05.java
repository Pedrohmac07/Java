package maratona.javacore.Bintrometodos.test;

import maratona.javacore.Bintrometodos.domain.Calculator;

public class CalcTest05 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] nums = {1,2,3,4};
        calculator.sumArray(nums);
        calculator.sumArrayArgs(1,2,3,4);
    }
}
