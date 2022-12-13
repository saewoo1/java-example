package test.객체지향;

class Car9 {
  String color;
  String gearType;
  int door;

  Car9() {} // 기본생성자
  Car9(String c, String g, int d) { // 매개변수가 있는 생성자
    color = c;
    gearType = g;
    door = d;
  }
}

class CarTest{
  public static void main(String[] args) {
    Car9 c1 = new Car9(); // 기본생성자를 이용해 인스턴스 생성
    c1.color = "white";
    c1.gearType = "auto";
    c1.door = 4;

    Car c2 = new Car("white", "auto", 4); // 매개변수가 있는 생성자로 인스턴스 생성 -> 바로 초기화댐 굿
    System.out.println("c1의 요소들 = " + c1.color + " " + c1.gearType + " " + c1.door);
    System.out.println("c2의 요소들 = " + c2.color + " " + c2.gearType + " " + c2.door);

    System.out.println("iv를 건드는지 테스트");
    Car c3 = new Car("red", "manual", 1000); // 매개변수가 있는 생성자로 인스턴스 생성 -> 바로 초기화댐 굿
    System.out.println(c3.color + " " + c3.gearType + " " + c3.door);
    System.out.println(c2.color + " " + c2.gearType + " " + c2.door);
  }
}
