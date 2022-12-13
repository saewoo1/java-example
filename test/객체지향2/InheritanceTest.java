package test.객체지향2;

class Point {
  int x;
  int y;
}

//class Circle extends Point {
//  int r;
//}

class Circle {
  Point c = new Point();
  int r;
}

public class InheritanceTest {
  public static void main(String[] args) {
    Circle c = new Circle();
//    c.x = 1;
//    c.y = 2;
//    c.r = 3;
//    System.out.println(c.x);
//    System.out.println(c.y);
//    System.out.println(c.r);
    c.c.x = 1;
    c.c.y = 2;
    c.r = 3;
    System.out.println(c.c.x);
    System.out.println(c.c.y);
    System.out.println(c.r);
  }
}
