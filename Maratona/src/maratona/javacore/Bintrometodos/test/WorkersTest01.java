package maratona.javacore.Bintrometodos.test;

import maratona.javacore.Bintrometodos.domain.Workers;

public class WorkersTest01 {
    public static void main(String[] args) {
        Workers worker01 = new Workers();
        Workers worker02 = new Workers();
        Workers worker03 = new Workers();

        worker01.name = "Pedro Machado";
        worker01.age = 18;
        worker01.salary = 2500.99D;

        worker02.name = "Guanabara";
        worker02.age = 32;
        worker02.salary = 6300.50D;

        worker03.name = "Adolf";
        worker03.age = 18;
        worker03.salary = 15000.00D;

        worker01.print();
        worker02.print();
        worker03.print();

        worker01.sumArray(worker01.salary, worker02.salary, worker03.salary);
    }
}
