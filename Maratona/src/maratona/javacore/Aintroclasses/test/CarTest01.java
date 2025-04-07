package maratona.javacore.Aintroclasses.test;

import maratona.javacore.Aintroclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Nissan Livina";
        car1.model = "Minivan";
        car1.year = 2012;

        car2.name = "Ford Mustang";
        car2.model = "Esportivo";
        car2.year = 1999;

        System.out.println("Carro 1: "+"\nNome: "+car1.name+"\nModelo: "+car1.model+"\nAno: "+car1.year);
        System.out.println("\nCarro 2: "+"\nNome: "+car2.name+"\nModelo: "+car2.model+"\nAno: "+car2.year);
    }
}
