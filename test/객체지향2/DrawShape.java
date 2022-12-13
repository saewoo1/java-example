package test.객체지향2;

class DrawShape {
  public static void main(String[] args) {
    MyPoint[] p = {
            new MyPoint(100, 100),
            new MyPoint(140, 50),
            new MyPoint(200, 100)
    };

    Triangle t = new Triangle(p);
    MyCircle c = new MyCircle(new MyPoint(150, 150), 50);

    t.draw();
    c.draw();
  }
}

class Shape {
  String color = "black";
  void draw() {
    System.out.printf("[color=%s]%n", color);
  }
}

class MyPoint {
  int x;
  int y;

  MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }
  MyPoint() {
    this(0, 0);
  }
  String getXY() {
    return "("+x+","+y+")";
  }
}

class MyCircle extends Shape {
  MyPoint center;
  int r;

  MyCircle() {
    this(new MyPoint(0, 0), 100);
  }

  MyCircle(MyPoint center, int r) {
    this.center = center;
    this.r = r;
  }
  void draw() {
    System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
  }
}

class Triangle extends Shape {
  MyPoint[] p = new MyPoint[3];

  Triangle(MyPoint[] p) {
    this.p = p;
  }

  void draw() {
  System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
  }
}