public class StaticMethodDemo {
  
  static int a;
  public String value;
  public void displayValue() {
    value = "Java";
    System.out.println("String value: " + value);
  }
  static void display() {
    a = 20;
    System.out.println("Value of a: " + a);
  }
  public static void main(String[] args) {
    StaticMethodDemo s = new StaticMethodDemo();
    display();
    s.displayValue();
  }
}
