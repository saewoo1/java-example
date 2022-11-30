package test.operator;

public class Ex3_11 {
  public static void main(String[] args) {
    double pi = 3.141592;
    double shortPi = Math.round(pi * 1000) / 1000.0;
    System.out.println(shortPi);

    System.out.println("과정");

    System.out.println(pi);
    System.out.println(Math.round(pi * 1000));
    System.out.println(Math.round((int)(pi * 1000)) / 1000.0); // 일부러 값손실을 낸 뒤에 원하는 자리수만큼 반내림
    System.out.println(Math.round(pi * 1000) / 1000.0); // 1000으로 나누면 int형끼리 나눠진거라 3만 나옴.

    System.out.printf("%.3f", pi);
  }
}
