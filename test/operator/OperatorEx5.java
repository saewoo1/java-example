package test.operator;

public class OperatorEx5 {
  public static void main(String[] args) {
    int a = 10;
    int b = 4;

    System.out.printf("%d + %d = %d%n", a, b, a + b);
    System.out.printf("%d - %d = %d%n", a, b, a - b);
    System.out.printf("%d * %d = %d%n", a, b, a * b);
    System.out.printf("%d / %d = %d%n", a, b, a / b);
    System.out.printf("%d + %.0f = %.2f%n", a, (float)b, a / (float)b);
  }
}
