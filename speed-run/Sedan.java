public class Sedan extends Car  {
  private int maxSpeed;

  public Sedan(String color, String fuelType, int height, int maxSpeed) {
    super(color, fuelType, height);
    this.maxSpeed = maxSpeed;
  }

  @Override
  public void start() {
    System.out.println("The Sedan started, vruuuum vruuuum");
  }


  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }
}
