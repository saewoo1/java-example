package test;

public class VarEx2 {
  public static void main(String[] args) {
    int x = 10, y = 20, tmp = 0;

    System.out.println("x: " + x + " y: " + y  + "\n");
    tmp = x;
    x = y;
    y = tmp;

    System.out.println("x: " + x + " y: " + y);

    System.out.println("x: " + 10 + " y:" + 20);
    System.out.println("x:10" + " y:20");
    System.out.println("x:10 y:" + 20);
    System.out.println("x:10 y:20");
  }
}
