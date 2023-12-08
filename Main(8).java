//creATE A parent class with two methods area and parameter
class Parent
{
  void display () 
public class Main implements extends Thread{
  public void run() 
  {
    System.out.println ("This is the parent class");
    System.out.println("This code is running in a thread");
  }
  void show (int num)
  {
    System.out.println ("the number in the parent class" + num);
  }
}

class Child extends Parent
{
  @Override void display ()
  {
    System.out.println ("This is the child class");
  }
  void show (double num)
  {
    System.out.println ("The number in the child class is" + num);
  }
}

public class Main
{
  public static void main (String[]args) {
  Parent parentObj = new Parent ();
    Child childObj = new Child ();
    parentObj.show (5);
    childObj.show (7.5);
    parentObj.display ();
    childObj.display ();
}
}
}