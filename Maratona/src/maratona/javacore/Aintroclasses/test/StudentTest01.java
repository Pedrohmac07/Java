package maratona.javacore.Aintroclasses.test;

import maratona.javacore.Aintroclasses.domain.Student;

/**
 * Classes em Java
 */
public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Pedro Henrique Machado";
        student.age = 18;
        student.gender = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
