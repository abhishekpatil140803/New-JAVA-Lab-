public class Main extends Thread{
  public  void run()
  {
      System.out.println("Welcome to CSIT");
  }
  public static void main(String[] args)
  {


    Main t1 = new Main();
    Main t2 = new Main();
    Main t3 = new Main();
    t1.start();
    t2.start();
    t3.start();
}
}