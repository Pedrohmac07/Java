package maratona.javacore.Bintrometodos.domain;

public class Workers {
    public String name;
    public int age;
    public double salary;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salary);
        System.out.println("--------------------");
    }

    public void sumArray(double n1, double n2, double n3) {
        double sum =  n1 + n2 + n3;
        int media = (int) ((int) sum / 3);
        System.out.println("Media dos salarios: "+media);
    }
}


