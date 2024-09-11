public class Main {
  public static void main(String[] args) {
      String message = null;
      // Potential NullPointerException
      System.out.println(message.toUpperCase());
  }
}