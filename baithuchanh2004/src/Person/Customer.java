package Person;

public class Customer extends Person {
  protected String customerID;
  public void addCustomerID(){
    System.out.println("Nhap ID Cua Khach Hang");
    customerID = sc.nextLine();
  }
  public void HienIDKhachHang(){
    System.out.println("CustomerID: "+customerID);
  }
  
}