public class Teste2 {
    public static int min(int[] list) {
        int minimo = list[0]; 
        for (int i : list) {
            if (i < minimo) {
                minimo = i;
            }
        }
        return minimo;
    }

    public static int max(int[] list) {
        int maximo = list[0]; 
        for (int i : list) {
            if (i > maximo) {
                maximo = i;
            }
        }
        return maximo;
    }

    public static void main(String[] args) {
        int[] numeros = {3, 7, -2, 10, 5}; 
        System.out.println("Mínimo: " + min(numeros)); 
        System.out.println("Máximo: " + max(numeros)); 
    }
}