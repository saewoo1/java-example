package test;

public class PrintfEx2 {
  public static void main(String[] args) {
    String url = "www.84seoul.kr";

    float f1 = .10f; // 0.10, 1.0e-1
    float f2 = 1e1f; // 10.0 1.0e1, 1.0e+1
    float f3 = 3.14e3f;
    double d = 1.23456789;

    System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
    System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
    System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

    System.out.printf("d=%f%n", d);
    System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리만, 남는 부분은 공백으로 찬다!

    System.out.printf("[12345678901234567890]%n");
    System.out.printf("[%s]%n", url);
    System.out.printf("[%20s]%n", url); // 총 20자리, 왼쪽부터 공백 만들며
    System.out.printf("[%-20s]%n", url); // 총 20자리, 오른쪽부터 공백 만들며
    System.out.printf("[%.8s]%n", url); // 왼쪽에서 8자리만 출력
  }
}
