public class Main {
  public static void main(String[] args) {
    Car mySuv = new SUV(-1);

    new Sedan("Red", "Gas", 100, 200);

    System.out.println(mySuv.getHeight());
    mySuv.start();

    CarDealership carDealership = new CarDealership();
    carDealership.addCarToPark(mySuv);


    System.out.println(Car.getCount());
    System.out.println(SUV.getCount());
  }
}
