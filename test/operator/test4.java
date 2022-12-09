package test.operator;

import java.util.Scanner;

public class test4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.printf("%.9f", (double)a / b);
  }
}
