package Person;
import java.util.Scanner;
public class Person{
  protected String name;
  protected int age;
  Scanner sc = new Scanner(System.in);
  public void addName(){
    System.out.println("Nhap Ten ");
    name = sc.nextLine();
  }
  public void addAge(){
    System.out.println("Nhap Tuoi ");
    age = sc.nextInt();
  }
  public void displayName(){
    System.out.println("Ten: "+name);
  }
  public void displayAge(){
    System.out.println("Tuoi: "+age);
  }
}