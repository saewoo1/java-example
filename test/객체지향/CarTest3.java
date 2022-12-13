package test.객체지향;

class Car {
  String color;
  String gearType;
  int door;

  Car() {
    this("white", "auto", 4);
  }

  Car(Car c) {
    color = c.color;
    gearType = c.gearType;
    door = c.door;
  }
  /*
  * 위의 코드는
  * Car(Car c) {
  *   this(c.color, c.gearType, c.door);
  * }
  * 이렇게 변환하는 것이 더 좋다.
  * */

  Car(String color, String gearType, int door) {
    this.color = color;
    this.gearType = gearType;
    this.door = door;
  }
}

class CarTest3 {
  public static void main(String[] args) {
    Car c1 = new Car();
    Car c2 = new Car(c1); // c1의 복사본 c2를 생성
    System.out.println("c1의 color= " + c1.color + ", gearType= " + c1.gearType + ", door= " + c1.door);
    System.out.println("c2의 color= " + c2.color + ", gearType= " + c2.gearType + ", door= " + c2.door);

    c1.door = 100; // c1의 인스턴스변수 door의 값 변경
    System.out.println("c1.door=100; 수행 후");
    System.out.println("c1의 color= " + c1.color + ", gearType= " + c1.gearType + ", door= " + c1.door);
    System.out.println("c2의 color= " + c2.color + ", gearType= " + c2.gearType + ", door= " + c2.door);
  }
}
