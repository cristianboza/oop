import java.util.ArrayList;
import java.util.List;

public class CarDealership {

  public static final int DISCOUNT_FOR_NEW_CUSTOMERS = 10;
  private List<Car> carsToSell = new ArrayList<>();

  private List<OffRoadVehicle> offRoadVehicles = new ArrayList<>();


  public void addCarToPark(Car c) {
    carsToSell.add(c);

    if (c instanceof OffRoadVehicle) {
      offRoadVehicles.add(((OffRoadVehicle) c));
    }
  }

  public void sellCar(Car carToSell) {
    carsToSell.remove(carToSell);
    if (carToSell instanceof OffRoadVehicle) {
      offRoadVehicles.remove(carToSell);
    }
  }

  public List<Car> getCarsToSell() {
    return carsToSell;
  }

  public List<OffRoadVehicle> getOffRoadVehicles() {
    return offRoadVehicles;
  }
}
