package test.operator;

public class OperatorEx6 {
  public static void main(String[] args) {
    byte a = 10;
    byte b = 20;
    byte c = (byte) (a + b); // byte는 int보다 작아서 자동적으로 int로 변환됐다. 일부러 byte로 캐스팅 해줘야댐

    System.out.println(c);
  }
}
