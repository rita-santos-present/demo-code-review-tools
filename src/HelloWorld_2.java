public class HelloWorld_2 {
  public static void main(String[] args) {
  System.out.println("Hello, World!");
  }

  public static void a(String message) {
      System.out.println(message);
  }

  public static void b() {
    int number = 10;
    if (number < 10) {
        System.out.println("Number is greater than 10");
    } else {
        System.out.println("Number is 10 or less");
    }
  }

  public static void c() {
    String message = null;
    System.out.println(message.toUpperCase());
  }

  public static void d() {
    System.out.println("Hello, World!");
    return; 
    System.out.println("This will never be printed");
  }

  public static void e() {
    for (int i = 0; i <= 10; i++) { 
        System.out.println(i);
    }
  }

  public static void f() {
    System.out.println("Hello, World!");

    int variable = 42;
  }

  public static void g() {

    for (int i = 0; i < 10; i++) {
        System.out.println("Iteration: " + i);
        if (i % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
  }

  public static void h() {
    String username = "admin";
    String password = "password123";
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
  }

  public static void i() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 1000; i++) {
        sb.append("Iteration: ").append(i).append("\n");
    }
    System.out.println(sb.toString());
  }

}
