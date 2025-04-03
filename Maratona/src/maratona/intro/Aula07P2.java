package maratona.intro;

/**
 *  byte, short, int, long float e double = 0
 *  char '/u0000'
 *  boolean = false
 *  String "null"
 */
public class Aula07P2 {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Pedro";
        names[1] = "Melissa";
        names[2] = "Kelly";
        names[3] = "Kanye West";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
