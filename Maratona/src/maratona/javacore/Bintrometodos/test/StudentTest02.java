package maratona.javacore.Bintrometodos.test;

import maratona.javacore.Bintrometodos.domain.PrintStudent;
import maratona.javacore.Bintrometodos.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        PrintStudent printStudent = new PrintStudent();

        student01.name = "Pedro Machado";
        student01.age = 18;
        student01.gender = 'M';

        student02.name = "Maria Soares";
        student02.age = 17;
        student02.gender = 'F';

        student01.print();
        student02.print();
    }
}
