package test.객체지향2;

public class MyParent {
  private int prv; // 같은 클래스
  int dft; // 같은 패키지
  protected int prt; // 같은패키지 + 다른 패키지 자손
  public int pub; // 접근 제한 없음.

  public void printMembers() {
    System.out.println(prv);
    System.out.println(dft);
    System.out.println(prt);
    System.out.println(pub);
  }
}

class MyParentTest {
  public static void main(String[] args) {
    MyParent myParent = new MyParent();

    //System.out.println(myParent.prv); // 에러 접근범위는 같은 클래스
    System.out.println(myParent.dft);
    System.out.println(myParent.prt);
    System.out.println(myParent.pub);
  }
}
