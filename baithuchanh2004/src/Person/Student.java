package Person;
public class Student extends Person {
  protected String studentID;
  public void addStudentID(){
    System.out.println("Nhap MSSV");
    studentID = sc.nextLine();
  }
  public void displayStudentID(){
    System.out.println("MSSV: "+ studentID);
  }
}