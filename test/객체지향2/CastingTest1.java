package test.객체지향2;

class CastingTest1 {
  public static void main(String[] args) {
    Car car = null;
    FireEngine fe = new FireEngine();
    FireEngine fe2 = null;

    fe.water();
    car = (Car)fe;
    //car.water(); 얘 안됨 리모콘 버튼 없는데 누를라해서
    fe2 = (FireEngine)car;
    fe2.water();
  }
}

class Car {
  String color;
  int door;

  void drive() {
    System.out.println("drive, Brrr~");
  }

  void stop() {
    System.out.println("stop!!!");
  }
}

class FireEngine extends Car {
  void water() {
    System.out.println("water!!!!");
  }
}