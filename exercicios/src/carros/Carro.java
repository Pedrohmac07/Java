package carros;


public class Carro {
    String nome;
    String marca;
    String cor;
    double valor;
    int ano;

    public void ligar() {
        System.out.println("Ligando " + nome);
    }
    public void examinar() {
        System.out.println(nome + marca + cor + valor + ano);
    }
    public void desligar() {
        System.out.println("Desligando " + nome);
    }
}
