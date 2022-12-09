package test.operator;

public class test {
  public static void main(String[] args) {
    int numOfApples = 123;
    int sizeOfBucket = 10;
    int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket != 0 ? 1 : 0); // 더 좋은 식이 업 ㅅ을까

    System.out.println("필요한 바구니의 수 : " + numOfBucket);
  }
}
