package test.객체지향2;

class PointTest {
  public static void main(String[] args) {
    MyPoint3D3 p3 = new MyPoint3D3(1, 2, 3);
    System.out.println(p3.getLocation());
  }
}

class MyPoint3 {
  int x, y;

  MyPoint3(int x, int y) { // 매개변수를 받는 생성자
    this.x = x;
    this.y = y;
  }

  String getLocation() {
    return "x :" + x + ", y :" + y;
  }
}

class MyPoint3D3 extends MyPoint3 {
  int z;

  MyPoint3D3(int x, int y, int z) {
    super(x, y);
    this.z = z;
  }

  String getLocation() {
    return "x :" + x + ", y :" + y + ", z :" + z;
  }
}
