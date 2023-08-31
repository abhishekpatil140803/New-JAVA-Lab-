class Country {
  static int countryCounter;

  String name;
  int dummyCounter;

  public static void main(String[] args) {
    Country ob1 = new Country();
    ob1.name = "India";
    ob1.dummyCounter = 2;
    ++ob1.countryCounter;
    Country ob2 = new Country();
    ob2.name = "china";
    ob2.dummyCounter = 2;
    ++ob2.countryCounter;
    System.out.println("ob1. countryCounter = " + ob1.countryCounter);
    System.out.println("ob2. countryCounter = " + ob2.countryCounter);
    System.out.println("Country. countryCounter = " + Country.countryCounter);
  }
}
