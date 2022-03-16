package shapes;
import java.util.Scanner;
public class Person {
  String PersonID;
  String PersonName;
  Boolean Gender;
  String Address;
  public void NhapThongTin(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap PersonID: ");
    PersonID = sc.nextLine();
    System.out.println("Nhap PersonName: ");
    PersonName = sc.nextLine();
    System.out.println("Nhap Address: ");
    Address = sc.nextLine();
    System.out.println("Nhap Gender: ");
    Gender = sc.nextBoolean();
    sc.close();
  }
  public void InThongTin(){
    System.out.println("PersonID: " + PersonID);
    System.out.println("PersonName: " + PersonName);
    if(Gender=true)
    System.out.println("Gender: Nam");
    else System.out.println("Gender: Nữ");
    System.out.println("Address: " + Address);
  }
}