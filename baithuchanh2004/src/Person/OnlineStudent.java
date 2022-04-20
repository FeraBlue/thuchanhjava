package Person;
import java.util.Scanner;
public class OnlineStudent extends Student{
public String devices;
public void addDevices(){
  Scanner sc = new Scanner(System.in);
      System.out.println("Thiet Bi : ");
      devices = sc.nextLine();
      sc.close();
  }

public void displayDevices(){
  System.out.println("Thiet Bi Cua Hoc Sinh: "+devices);
}
public void placeToStudy(){
  System.out.println(" Hoc Tren Teams");
}
}