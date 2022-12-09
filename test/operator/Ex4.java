package test.operator;

public class Ex4 {
  public static void main(String[] args) {
    int num = 456;

    System.out.println(num % 100 != 0 ? (num / 100 ) * 100 : num);
  }
}
