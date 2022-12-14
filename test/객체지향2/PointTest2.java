package test.객체지향2;

class PointTest2 {
  public static void main(String[] args) {
    Point3D5 p5 = new Point3D5(100, 200, 300);
    System.out.println("p5.x=" + p5.x);
    System.out.println("p5.y=" + p5.y);
    System.out.println("p5.z=" + p5.z);
  }
}

class Point5 {
  int x = 10;
  int y = 20;

  Point5() {}
  Point5(int x, int y) { // 조상 생성자가 받아서 초기화 해줘
    this.x = x;
    this.y = y;
  }
}

class Point3D5 extends Point5 {
  int z = 30;

//  Point3D5() {
//    this(100, 200, 300); // 밑에 매개변수를 받는 생성자 호출
//  }
  Point3D5(int x, int y, int z) { // this() 호출한거 받어
//    super(x, y); // 조상 생성자 호출해
    this.x = x;
    this.y = y;
    this.z = z;
  }
}
