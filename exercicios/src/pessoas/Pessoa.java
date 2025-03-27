package pessoas;

public class Pessoa {
    String nome;
    int idade;
    char sexo;
    double altura;

    void andar() {
        System.out.println(nome + " está caminhando");
    }

    void comer() {
        System.out.println("almoçando");
    }

    void correr() {
        System.out.println(nome + "Correndo...");
    }

    void dormir() {
        System.out.println("Dormindo");
    }
}
