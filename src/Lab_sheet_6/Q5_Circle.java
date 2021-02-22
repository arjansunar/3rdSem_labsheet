package Lab_sheet_6;

public class Q5_Circle {
  public static void main(String[] args) {
    Circle circle= new Circle(4);
    System.out.println("Circle with radius 4: "+circle);
    Circle circle1= new Circle();
    System.out.println("Circle with default radius: "+circle1);
  }
}
class Circle {
  private int radius;
  private double circumference;

  public Circle(int radius) {
    this.radius = radius;
    circumference=calcCircumference(radius);
  }

  public Circle(){
    this(1);
  }

  public double calcCircumference(int radius){
    return 2*Math.PI*radius;
  }

  @Override
  public String toString() {
    return "Circle{" +
            "radius=" + radius +
            ", circumference=" + circumference +
            '}';
  }
}