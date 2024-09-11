public class Main {
  public static void main(String[] args) {
      System.out.println("Hello, World!");
      try {
          printMessage("Welcome to Java Programming!");
      } catch (Exception e) {
          System.err.println("An error occurred: " + e.getMessage());
      }
  }

  public static void printMessage(String message) throws Exception {
      if (message == null) {
          throw new Exception("Message cannot be null!");
      }
      System.out.println(message);
  }
}
