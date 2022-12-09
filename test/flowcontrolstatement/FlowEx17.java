package test.flowcontrolstatement;

import java.util.Scanner;

public class FlowEx17 {
  public static void main(String[] args) {

    System.out.println("몇 줄짜리 별?");
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    System.out.println(num + "줄 짜리 별 생성합니당");

    for (int i = 0; i < num; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
