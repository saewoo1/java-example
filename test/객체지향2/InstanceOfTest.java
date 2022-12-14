package test.객체지향2;

class InstanceOfTest {
  public static void main(String[] args) {
    FireEngine99 fireEngine99 = new FireEngine99();

    if (fireEngine99 instanceof FireEngine99) {
      System.out.println("This is a FireEngine99 instance.");
    }

    if (fireEngine99 instanceof Car99) {
      System.out.println("This is a Car99 instance");
    }

    if (fireEngine99 instanceof Object) {
      System.out.println("This is Object instance");
    }

    System.out.println(fireEngine99.getClass().getName());
  }
}

class Car99 {}
class FireEngine99 extends Car99 {}