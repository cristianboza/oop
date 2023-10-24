public abstract class Car {
  private static int count;
  private String color;
  private final String fuelType;
  private int height;

  public Car(final String color, String fuelType, int height) {
//    color = "Gray";
    this.color = color;
    this.fuelType = fuelType;
    setHeight(height);
    count++;
  }

  public static int getCount() {
    return count;
  }

  public abstract void start();

  public final void start(int times){
    for (int i = 0; i < times; i++) {
      start();
    }
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getFuelType() {
    return fuelType;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    if (height < 1) {
      this.height = 10;
      return;
    }
    this.height = height;
  }


}
