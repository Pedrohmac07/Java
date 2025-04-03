package maratona.intro;

/**
 * Arrays multidimensionais
 */
public class Aula08P1 {
    public static void main(String[] args) {
        int[][] daysAndMonths = new int[2][2];
        daysAndMonths[0][0] = 31;
        daysAndMonths[0][1] = 12;

        daysAndMonths[1][0] = 7;
        daysAndMonths[1][1] = 4;

        for (int i=0;i< daysAndMonths.length;i++) {
            for (int j=0;j< daysAndMonths[0].length;j++) {
                System.out.println(daysAndMonths[i][j]);
            }
        }

        for (int[] arrB:daysAndMonths) {
            for (int num:arrB) {
                System.out.println(num);
            }
        }
    }
}
