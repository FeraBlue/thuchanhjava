package Person;

public class FullTimeEmployee extends Employee {
  public int overtimeHours;
  public static int basicSalary = 7000000;
  public void addOvertimeHours(){
    System.out.println("So thoi gian lam qua");
    overtimeHours = sc.nextInt();
  }
  public int Salary(){
    return overtimeHours*50000 + basicSalary;
  }
  public void typeOfEmployee(){
    System.out.println("Loai nhan vien: Nhan vien lam toan thoi gian");
  }
}