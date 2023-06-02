public class TrafficLight {
  private String color;
  private int duration;

  public TrafficLight(String color, int duration) {
    this.color = color;
    this.duration = duration;
  }

  public void changeColor(String newColor) {
    color = newColor;
  }

  public boolean isRed() {
    return color.equals("rdeča");
  }

  public boolean isGreen() {
    return color.equals("zelena");
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public static void main(String[] args){
    TrafficLight tl = new TrafficLight("zelena",45);
    tl.changeColor("rdeča");
    System.out.println(tl.isGreen());
  }
}
