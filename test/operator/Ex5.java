package test.operator;

import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());
    System.out.println(num % 10 != 1 ? (num / 10) * 10 + 1 : num);
  }
}
