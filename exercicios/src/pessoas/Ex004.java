package pessoas;
public class Ex004 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Pedro";
        pessoa1.idade = 18;
        pessoa1.sexo = 'M';
        pessoa1.altura = 1.70;
        
        pessoa2.nome = "Melissa";
        pessoa2.idade = 12;
        pessoa2.sexo = 'F';
        pessoa2.altura = 1.63;

        pessoa1.andar();
        pessoa2.correr();

        System.out.println("Altura do " + pessoa1.nome + " é de " + pessoa1.altura);
        System.out.println("Idade da " + pessoa2.nome + " é de " + pessoa2.idade + "anos");
    }
}
