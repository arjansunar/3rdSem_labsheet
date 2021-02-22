
public class Test {
  public static void main(String[] args) {
    C[] elements= {new A(),new B(),new C(),new D()};
    for (C element : elements) {
      System.out.println(element.getClass());
      element.method1();
      element.method2();
    }
  }
}
class C{
  public void method1(){
    System.out.println("c 1");
  }
  public void method2(){
    System.out.println("c 2");
  }
}

class A extends B{
  @Override
  public void method2() {
    System.out.println("a 2");
  }
}

class B extends C{
  @Override
  public void method2() {
    System.out.println("b 2");  }
}

class D extends B{
  @Override
  public void method1() {
    System.out.println("d 1");
  }
}
