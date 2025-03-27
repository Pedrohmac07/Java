package carros;
import java.lang.reflect.Field;


public class Ex005 {
    public static void main(String[] args) {
        Carro meuCarro1 = new Carro();
    Carro meuCarro2 = new Carro();

    meuCarro1.nome = "New-Beatle";
    meuCarro1.marca = "VolksWagen";
    meuCarro1.cor = "Azul";
    meuCarro1.valor = 2800.99;
    meuCarro1.ano = 2027;

    meuCarro2.nome = "Mustang";
    meuCarro2.marca = "Ford";
    meuCarro2.cor = "Preto";
    meuCarro2.valor = 5000.50;
    meuCarro2.ano = 1998;

    Class<?> classe = Carro.class;

    Field[] atributos = classe.getDeclaredFields();

    System.out.println("Atributos e valores do carro:");
        for (Field atributo : atributos) {
            try {
                Object valor = atributo.get(meuCarro1); // Obtendo o valor do atributo
                System.out.println(atributo.getName() + " = " + valor);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    System.out.println("Atributos e valores do carro:");
    for (Field atributo : atributos) {
        try {
            Object valor = atributo.get(meuCarro2); // Obtendo o valor do atributo
            System.out.println(atributo.getName() + " = " + valor);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    meuCarro1.ligar();
    meuCarro2.desligar();

    }
}
