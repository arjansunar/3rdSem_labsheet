package Lab_sheet_6;

public class Q12_creatingClassFromUML {
  public static void main(String[] args) {
    //testing the rectangle Class
    var rectangle= new Rectangle();
    System.out.println(rectangle.toString());
    var rectangle1= new Rectangle(15,12);
    System.out.println(rectangle1);
    System.out.println("perimeter of rectangle 1: "+ rectangle1.getPerimeter());
    System.out.println("area of rectangle1: "+ rectangle1.getArea());
//    testing the employee class
    var employee= new Employee(1001,"Arjan","Sunar",10000);
    System.out.println(employee.toString());
    System.out.println("annual salary: "+ employee.getAnnualSalary());
    System.out.println("Raising salary by 10 percent: "+employee.raiseSalary(10));
//    testing the invoiceItem class
    var invoiceItem= new InvoiceItem("A001","buying 2 laptops",2,1000);
    System.out.println(invoiceItem.toString());
    System.out.println("Description: "+invoiceItem.getDesc());
    System.out.println("Unit price: "+ invoiceItem.getUnitPrice());
    System.out.println("Total: "+ invoiceItem.getTotal());
    invoiceItem.setUnitPrice(1500);
    System.out.println("Unit price after setting it: "+ invoiceItem.getUnitPrice());

    //testing the Account class
    var account = new Account("AB001","Arjan",10000);
    System.out.println(account.toString());
    System.out.println("Crediting Rs 1000: "+ account.credit(1000));
    System.out.println("Debiting Rs 1000: "+ account.debit(1000));
    var account1 = new Account("AB002","Arun",1000);
    System.out.println(account1+"\nTransferring Rs 1000 from Arjan to Arun");
    System.out.println("New balance: "+account.transferTo(account1,1000));
    System.out.println(account1);
// testing the MyComplex class
    var left= new MyComplex(1,0);
    var right = new MyComplex(2,3);
    System.out.println("Left: "+left);
    System.out.println("Right: "+right);
    System.out.println("Right is real? "+ right.isReal());
    System.out.println("Right is imaginary? "+ right.isImaginary());
    System.out.println("Adding right to left: "+ left.add(right));
    System.out.println("Adding right to left but returning a new object: "+ left.addNew(right));
    System.out.println("left: "+left);
    System.out.println("Right: "+right);
    System.out.println("Multiplying right to left complex number: "+ left.multiply(right));
    System.out.println("Dividing left by right complex number: "+ left.divide(right));
    System.out.println("Conjugate of left complex number: "+left.conjugate());
  }
}

//1st Uml Diagram
class Rectangle{
  private float length;
  private float width;

  public Rectangle() {
    this(1.0f,1.0f);
  }

  public Rectangle(float length, float width) {
    this.length = length;
    this.width = width;
  }

  public double getArea(){
    return length*width;
  }
  public double getPerimeter(){
    return  2*(length+width);
  }

  public float getLength() {
    return length;
  }

  public void setLength(float length) {
    this.length = length;
  }

  public float getWidth() {
    return width;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  public String toString(){
    return String.format("Rectangle[ length= %f ,width= %f",length,width);
  }

}

//2nd UML diagram
class Employee{
  private int id;
  private String firstName;
  private String lastName;
  private int salary;

  public Employee(int id, String firstName, String lastName, int salary) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public  String getName(){
    return firstName.concat(" "+ lastName);
  }
  public int getSalary() {
    return salary;
  }

  public int getAnnualSalary(){
    return salary*12;
  }

  public int raiseSalary(int percentage){
    int newSalary = (int)(salary*(1+(double)percentage/100));
    setSalary(newSalary);
    return newSalary;
  }

  public String toString(){
    return String.format("Employee[id= %d, name= %s %s, salary= %d",id,firstName,lastName,salary);
  }
}

//3rd UML Diagram
class InvoiceItem{
  private String id;
  private String desc;
  private int qty;
  private double unitPrice;

  public InvoiceItem(String id, String desc, int qty, double unitPrice) {
    this.id = id;
    this.desc = desc;
    this.qty = qty;
    this.unitPrice = unitPrice;
  }

  public String getId() {
    return id;
  }

  public String getDesc() {
    return desc;
  }

  public int getQty() {
    return qty;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public double getTotal(){
    return  unitPrice*qty;
  }

  public String toString(){
    return String.format("InvoiceItem[id=%s,desc=%s,qty=%d,unitPrice=%f",id,desc,qty,unitPrice);
  }
}

//4th UML Diagram
class Account{
  private String id;
  private String name;
  private int balance;

  public Account(String id, String name, int balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  public Account(String id,String name) {
    this(id,name,0);
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public int credit(int amount){
    balance+=amount;
    return balance;
  }

  public int debit(int amount){
    if (amount<=balance) balance-=amount;
    else System.out.println("amount exceeded");
    return balance;
  }

  public int transferTo(Account account,int amount){
    if (amount<=balance) {
      balance-=amount;
      account.credit(amount);
    }else System.out.println("amount exceeded");
    return balance;
  }

  public String toString(){
    return String.format("Account[id=%s,name=%s,balance=%d",id,name,balance);
  }
}
//5th UML Diagram
class MyComplex{
  private double real;
  private double imag;

  public MyComplex(){
    this(0.0,0.0);
  }

  public MyComplex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public double getReal() {
    return real;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public double getImag() {
    return imag;
  }

  public void setImag(double imag) {
    this.imag = imag;
  }

  public void setValue(double real,double imag){
    setReal(real);
    setImag(imag);
  }

  public String toString(){
    return String.format("(%f + %fi)",real,imag);
  }

  public boolean isReal(){
    return imag==0;
  }

  public boolean isImaginary(){
    return imag!=0;
  }

  public boolean equals(double real,double imaginary){
    return  this.real==real && this.imag==imaginary;
  }

  public boolean equals(MyComplex obj){
    return this.real==obj.real && this.imag==obj.imag;
  }

  public double magnitude(){
    return Math.sqrt(Math.pow(real,2)+Math.pow(imag,2));
  }

  public double argument(){
    return Math.atan(imag/real);
  }

  public MyComplex add(MyComplex right){
    real+= right.real;
    imag+= right.imag;
    return this;
  }

  public MyComplex addNew(MyComplex right){
    double real = this.real+right.real;
    double imag= this.imag+right.imag;
    return new MyComplex(real,imag);
  }

  public MyComplex subtract(MyComplex right){
    real-= right.real;
    imag-= right.imag;
    return this;
  }

  public MyComplex subtratNew(MyComplex right){
    double real = this.real- right.real;
    double imag= this.imag- right.imag;
    return new MyComplex(real,imag);
  }

  public MyComplex multiply(MyComplex right){
    double realTemp = this.real;
    this.real= this.real* right.real+ this.imag* right.imag*-1;
    this.imag= realTemp*right.imag + this.imag*right.real;
    return this;
  }

  public MyComplex divide(MyComplex right){
    double denominator=(right.real*right.real+ right.imag*right.imag );
    double realTemp= this.real;
    this.real= (this.real*right.real - this.imag* right.imag*-1)/denominator;
    this.imag= (-realTemp* right.imag + this.imag*right.real)/denominator;
    return this;
  }

  public MyComplex conjugate(){
    this.imag*=-1;
    return this;
  }
}