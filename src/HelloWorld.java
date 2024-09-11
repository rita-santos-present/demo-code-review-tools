public class helloWorld {
public static void main(String[] args) {
System.out.println("Hello, World!");
}

// Method name does not follow camelCase
public static void codeStyleViolations(String message) {
    System.out.println(message);
}

public static void LogicalErrors() {
  int number = 10;
  // Incorrect logic: should check if number is greater than 10
  if (number < 10) {
      System.out.println("Number is greater than 10");
  } else {
      System.out.println("Number is 10 or less");
  }
}

public static void nullPointerException() {
  String message = null;
  // Potential NullPointerException
  System.out.println(message.toUpperCase());
}

public static void unreachableCode() {
  System.out.println("Hello, World!");
  return; // Unreachable code
  System.out.println("This will never be printed");
}

public static void offByOneError() {
  for (int i = 0; i <= 10; i++) { // Off-by-one error
      System.out.println(i);
  }
}

public static void unusedCode() {
  System.out.println("Hello, World!");

  // Unused variable
  int unusedVariable = 42;
}

public static void codeSmells() {
  // Long method with multiple responsibilities
  for (int i = 0; i < 10; i++) {
      System.out.println("Iteration: " + i);
      // Complex logic
      if (i % 2 == 0) {
          System.out.println("Even number");
      } else {
          System.out.println("Odd number");
      }
  }
}

public static void securityIssues() {
  // Hard-coded credentials (bad practice)
  String username = "admin";
  String password = "password123";
  System.out.println("Username: " + username);
  System.out.println("Password: " + password);
}

public static void performanceIssues() {
  StringBuilder sb = new StringBuilder();
  // Inefficient string concatenation
  for (int i = 0; i < 1000; i++) {
      sb.append("Iteration: ").append(i).append("\n");
  }
  System.out.println(sb.toString());
}

}
