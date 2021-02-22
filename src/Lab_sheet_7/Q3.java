package Lab_sheet_7;

public class Q3 {
  public static void main(String[] args) {
    Employee employee = new Employee();
    System.out.println("Employee:\n--------");
    System.out.println("Hours: "+ employee.getHours() +
            "\nSalary: " + employee.getSalary()+
            "\nVacation Days: "+employee.getVacationDays()+
            "\nVacation Form: "+employee.getVacationForm());

    Marketer marketer = new Marketer();
    System.out.println("\nMarketer:\n--------");
    System.out.println("Hours: "+ marketer.getHours() +
            "\nSalary: " + marketer.getSalary()+
            "\nVacation Days: "+marketer.getVacationDays()+
            "\nVacation Form: "+marketer.getVacationForm()+
            "\nAdvertise: ");
    marketer.advertise();

    Janitor janitor = new Janitor();
    System.out.println("\nJanitor:\n--------");
    System.out.println("Hours: "+ janitor.getHours() +
            "\nSalary: " + janitor.getSalary()+
            "\nVacation Days: "+janitor.getVacationDays()+
            "\nVacation Form: "+janitor.getVacationForm()+"\nClean: ");
    janitor.clean();

    HarvardLawyer harvardLawyer = new HarvardLawyer();
    System.out.println("\nHarvardLawyer:\n--------");
    System.out.println("Hours: "+ harvardLawyer.getHours() +
            "\nSalary: " + harvardLawyer.getSalary()+
            "\nVacation Days: "+harvardLawyer.getVacationDays()+
            "\nVacation Form: "+harvardLawyer.getVacationForm());

  }
}

class Employee {
  public int getHours(){
    return 40;
  }

  public double getSalary(){
    return 40000.0;
  }

  public int getVacationDays(){
    return 10;
  }

  public String getVacationForm(){
    return "yellow";
  }
}

class Secretary extends Employee{
  public void takeDictation (String text){
    System.out.println("Taking dictation of text: "+ text);
  }
}
class LegalSecretary extends Secretary{
  public double getSalary(){
    return super.getSalary() +5000.0;
  }

  public void fileLegalBriefs(){
    System.out.println("I could file all day!");
  }
}

class Lawyers extends Employee{
  public int getVacationDays(){
    return super.getVacationDays() +5;
  }

  public String getVacationForm(){
    return "pink";
  }

  public void sue(){
    System.out.println("I'll see you in court!");
  }
}

class Marketer extends Employee{
  @Override
  public double getSalary(){
    return  super.getSalary()+10000.0;
  }

  public void advertise(){
    System.out.println("Act now, while supplies last!");
  }
}

class Janitor extends Employee{
  @Override
  public int getHours(){
    return super.getHours()*2;
  }

  @Override
  public double getSalary(){
    return super.getSalary() -10000.0;
  }

  @Override
  public int getVacationDays() {
    return super.getVacationDays()/2;
  }

  public void clean(){
    System.out.println("Workin' for the man.");
  }
}

class HarvardLawyer extends Lawyers{
  @Override
  public double getSalary() {
    return super.getSalary()*(1+20.0/100);
  }

  @Override
  public int getVacationDays() {
    return super.getVacationDays()+3;
  }

  @Override
  public String getVacationForm() {
    StringBuilder vacationForm= new StringBuilder();
    for (int i = 0; i < 4; i++) {
      vacationForm.append(super.getVacationForm());
    }
    return vacationForm.toString();
  }
}