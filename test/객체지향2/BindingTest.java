package test.객체지향2;

class BindingTest {
  public static void main(String[] args) {
    Parent99 p = new Child99();
    Child99 c = new Child99();

    System.out.println("p.x = " + p.x); // 중복 선언이 되어 있어서 Child99의 객체를 불러와도, 본인의 인스턴스 변수를 사용한다.
    p.method();

    System.out.println("c.x = " + c.x);
    c.method();
  }
}

class Parent99 {
  int x = 100;
  void method() {
    System.out.println("Parent Method");
  }
}

class Child99 extends Parent99 {
  int x = 200;
  void method() {
    System.out.println("Child Method");
  }
}