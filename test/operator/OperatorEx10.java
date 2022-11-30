package test.operator;

public class OperatorEx10 {
  public static void main(String[] args) {
    int a = 1_000_000;

    int result = a * a / a;
    int result2 = a / a * a;
    System.out.printf("%d * %d / %d = %d%n", a, a, a, result);
    System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
  }
}
