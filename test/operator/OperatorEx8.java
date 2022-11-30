package test.operator;

public class OperatorEx8 {
  public static void main(String[] args) {
    int a = 1_000_000;
    int b = 2_000_000;

    long c = a * b;

    System.out.println("형변환 이전 c: " + c);
    // 이미 곱해진 시점에서 int * int = int라 값손실난 결과가 long c에 들어감.

    c = (long)a * b;
    System.out.println("형변환 이후 c: " + c);


  }
}
