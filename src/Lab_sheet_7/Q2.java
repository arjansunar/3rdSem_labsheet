package Lab_sheet_7;

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter How Many Records:");
    int size= sc.nextInt();
    var arr= new Person_Q2[size];

    //getting inputs
    for (int i = 0; i < size; i++) {
      System.out.println("Enter Data:");
      System.out.println("Enter Record Type:\n1. Student\n2. Teacher");
      int recordType= sc.nextInt();
      if (recordType==1){
        System.out.println("Enter Data:");
        String name= sc.next();
        int age = sc.nextInt();
        int sem = sc.nextInt();
        arr[i]= new Student_Q2(name,age,sem);
      }else if(recordType==2){
        System.out.println("Enter Data:");
        String name= sc.next();
        int age = sc.nextInt();
        String department= sc.next();
        arr[i]= new Teacher_Q2(name,age,department);
      }else{
        System.out.println("Enter either 1 or 2");
      }
    }
    System.out.println("Before Sorting:");
    for (Object i : arr) {
      System.out.println(i.toString());
    }

    Person_Q2[] temp = arr.clone();
    int start=0,end= temp.length-1;
    int noOfTeachers=0;

    // adding teacher object to the left of the array
    for (Person_Q2 o : temp) {
      if (o.toString().contains("Teacher")) {
        arr[start++] = o;
        noOfTeachers++;
      } else {
        arr[end--] = o;
      }
    }

    //sorting according to the names for teachers
    for (int i = 0; i < noOfTeachers-1; i++) {
      for (int j = i+1; j < noOfTeachers; j++) {
        if(arr[i].getName().compareToIgnoreCase(arr[j].getName())>0){
          Person_Q2 oldVal= arr[i];
          arr[i]=arr[j];
          arr[j]=oldVal;
        }
      }
    }

    //sorting according to the names for students
    for (int i = noOfTeachers; i < arr.length-1; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr[i].getName().compareToIgnoreCase(arr[j].getName()) > 0) {
          Person_Q2 oldVal = arr[i];
          arr[i] = arr[j];
          arr[j] = oldVal;
        }
      }
    }

    //printing the results
    System.out.println("After Sorting:");
    for (Object i : arr) {
      System.out.println(i.toString());
    }
  }
}

class Person_Q2{
  private final String name;
  private final int age;

  public Person_Q2(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

class Student_Q2 extends Person_Q2{
  private final int sem;

  public Student_Q2(String name, int age,int sem) {
    super(name, age);
    this.sem=sem;
  }

  @Override
  public String toString(){
    return String.format("Student [sem= %d, name = %s, age= %d]",sem,getName(),getAge());
  }
}

class Teacher_Q2 extends Person_Q2{
  private final String department;

  public Teacher_Q2(String name, int age, String department) {
    super(name, age);
    this.department = department;
  }

  @Override
  public String getName(){
    return super.getName();
  }
  @Override
  public String toString(){
    return String.format("Teacher [department= %s, name = %s, age= %d]",department,getName(),getAge());
  }

}