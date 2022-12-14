package test.객체지향2;

class Time {
  private int hour;
  private int minute;
  private int second;

  public void setHour(int hour) {
    if (isValidHour(hour)) {
      System.out.println("시간이 잘못된 값입니다.");
      return ;
    }
    this.hour = hour;
  }

  private boolean isValidHour(int hour) {
    return hour < 0 || hour > 23;
  }
  public int getHour() {
    return hour;
  }

  public void setMinute(int minute) {
    if (minute < 0 || minute > 59) {
      System.out.println("분이 잘못된 값입니다.");
      return ;
    }
    this.minute = minute;
  }

  public int getMinute() {
    return minute;
  }

  public void setSecond(int second) {
    if (second < 0 || second > 59) {
      System.out.println("초가 잘못된 값입니다.");
      return ;
    }
    this.second = second;
  }

  public int getSecond() {
    return second;
  }
}

public class TimeTest {
  public static void main(String[] args) {
    Time time = new Time();
    time.setHour(25);
    System.out.println("hour : " + time.getHour());
    time.setMinute(99);
    System.out.println("min : " + time.getMinute());
    time.setSecond(52);
    System.out.println("sec : " + time.getSecond());
  }
}
