package Lab_sheet_6;

public class Q7_Dimension {
  public static void main(String[] args) {
    Dimension dimension= new Dimension(5,4,3);
    System.out.println("Old object\n"+ dimension);
    Dimension dimension1= new Dimension(dimension);
    System.out.println("new object with same values\n"+ dimension1);
  }
}
class Dimension{
  private double length,
          width,
          height;

  public Dimension(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public Dimension(double side) {
    this(side,side,side);
  }

  public Dimension(Dimension dim){
    this(dim.length, dim.width, dim.height);
  }
  public double volume(){
    return length*width*height;
  }

  public double area(){
    return 2*(faceArea()+topArea()+sideArea());
  }

  private double faceArea(){
    return length*height;
  }
  private double topArea(){
    return length*width;
  }
  private double sideArea(){
    return width*height;
  }

  @Override
  public String toString() {
    return "Dimension{" +
            "length=" + length +
            ", width=" + width +
            ", height=" + height +
            '}';
  }
}