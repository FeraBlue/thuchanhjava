package Person;

public class Employee extends Person {
  protected String Posistion;
  public void addPosition(){
    System.out.println("Nhap chuc vu");
    Posistion = sc.nextLine();
  }
  public void displayPosition(){
    System.out.println("Chucvu: "+ Posistion);
  }
}