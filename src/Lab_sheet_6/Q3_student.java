package Lab_sheet_6;

public class Q3_student {
  public static void main(String[] args) {
    Student student= new Student("Arun",18,70,60,89);
    student.computeAverage();
    student.computeMinimumMark();
    student.showResults();
  }
}

class Student{
  private String name;
  private int age;
  private int m1;
  private int m2;
  private int m3;
  private int minimum;
  private double average;

  public Student(String name, int age, int m1, int m2, int m3) {
    this.name = name;
    this.age = age;
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
  }

  public void computeAverage() {
    average= ((double) m1+m2+m3)/3;
  }

  public void computeMinimumMark(){
    minimum= Math.min(Math.min(m1,m2),m3);
  }

  public void showResults(){
    System.out.println("Name: " + name);
    System.out.println("Age: "+age);
    System.out.println("Marks\n-----\nm1: "+ m1+"\nm2: "+m2+"\nm3: "+ m3);
    System.out.println("Minimum mark: "+ minimum);
    System.out.println("Average: "+average);
  }
}