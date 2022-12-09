package test.operator;

public class Ex6 {
  public static void main(String[] args) {
    int num = 94;
    System.out.println(num % 10 != 0 ? (int)(Math.ceil((float)num / 10) * 10 - num) : num);
    System.out.println(num % 10 != 0 ? 10 - (num % 10) : 0);
  }
}
