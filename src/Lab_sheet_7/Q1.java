package Lab_sheet_7;

import java.util.Arrays;

public class Q1 {
  public static void main(String[] args) {
    Person person = new Person("Arjan","Nepal");
    System.out.println(person+"\n");

    Teacher teacher = new Teacher("John","Kathmandu");
    teacher.addCourse("Math");
    teacher.addCourse("Science");
    teacher.addCourse("English");
    teacher.addCourse("Computer");
    System.out.println(teacher);
    System.out.println("Successfully removed Math: "+teacher.removeCourse("Math"));
    System.out.println(teacher);
    System.out.println("Successfully added History: "+teacher.addCourse("History"));
    System.out.println(teacher);

    Student student = new Student("Will","Kathmandu");
    System.out.println("\n"+student);
    student.addCourseGrade("History",90);
    student.addCourseGrade("Science",50);
    student.addCourseGrade("Computer",80);
    student.addCourseGrade("English",78);
    System.out.println(student);
    System.out.println("\nAverage grades: "+student.getAverageGrade()+"\n");
    student.printGrades();

  }
}
class Person{
  private final String name;
  private String address;

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName(){
    return name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString(){
    return String.format("Person: [ name: %s, address: %s]",name,address);
  }

}

class Student extends Person{
  private final int numCourses=4;
  private final String[] courses= {"History", "Science","English","Computer"};
  private final int[] grades= new int[numCourses];

  public Student(String name, String address){
    super(name,address);
  }

  @Override
  public String toString(){
    return String.format("Student: [ Number of courses: %d, courses: %s, grades: %s]",numCourses, Arrays.toString(courses),Arrays.toString(grades));
  }

  public void addCourseGrade( String course, int grade){
      for (int i=0; i< numCourses;i++) {
        if (courses[i].equals(course)){
          grades[i]=grade;
        }
      }
  }

  public void printGrades(){
    System.out.println("Grades:\n--------");
    for (int grade : grades) {
      System.out.println(grade);
    }
  }

  public double getAverageGrade(){
    int sum=0;
    for (int grade : grades) {
      sum+=grade;
    }
    return (double)sum/numCourses;
  }
}

class Teacher extends Person{
  private final int numCourses=4;
  private final String[] courses= new String[numCourses];

  public Teacher(String name,String address){
    super(name,address);
  }

  @Override
  public String toString(){
    return String.format("Teacher: [ Number of courses: %d, courses: %s]",numCourses, Arrays.toString(courses));
  }

  public boolean addCourse(String course){
    for (int i = 0; i < courses.length; i++) {
      if(courses[i]==null || courses[i].equals("")){
        courses[i]=course;
        return true;
      }
    }
    return false;
  }

  public boolean removeCourse(String course){
    for (int i = 0; i < courses.length; i++) {
      if (courses[i].equals(course)){
        courses[i]="";
        return true;
      }
    }
    return false;
  }

}