public class Teste1 {
  public static String areYouPlayingBanjo(String name) {
    if (name.startsWith("R") || name.startsWith("r")) {
        return name + " plays banjo";
    } else {
        return name + " does not play banjo";
    }
  }

  public static void main(String[] args) {
    System.out.println(areYouPlayingBanjo("Ricardo"));
    System.out.println(areYouPlayingBanjo("João"));
    System.out.println(areYouPlayingBanjo("rafael"));
  }
}