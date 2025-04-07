package maratona.javacore.Aintroclasses.test;

import maratona.javacore.Aintroclasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Nome: "+student.name);
        System.out.println("Idade: "+student.age);
        System.out.println("Genêro: "+student.gender);
    }
}
