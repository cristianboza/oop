public final class SUV extends Car implements OffRoadVehicle  {
  private static int count;

  private boolean is4X4;

  public SUV(String color, String fuelType, int height, boolean is4X4) {
    super(color, fuelType, height);
    this.is4X4 = is4X4;
    count++;
  }

  public SUV(int height, boolean is4X4){
    super("Gray", "Diesel", height);
    this.is4X4 = is4X4;
    count++;
  }

  public SUV(int height){
    this(height, true);
  }

  public static int getCount() {
    return count;
  }

  @Override
  public void start() {
    System.out.println("The SUV started, vruuuum vruuuum");
  }

  public boolean isIs4X4() {
    return is4X4;
  }

  public void setIs4X4(boolean is4X4) {
    this.is4X4 = is4X4;
  }

  @Override
  public boolean isOffRoad() {
    return is4X4;
  }

  @Override
  public void goOffRoadIfCan() {
    if(isOffRoad()) {
      System.out.println("Going off road");
    }
  }
}
