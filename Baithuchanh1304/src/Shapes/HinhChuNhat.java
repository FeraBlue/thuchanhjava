package Shapes;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    public void hinhChuNhat() {
        ten = "Hinh Chu Nhat";

    }
    public void nhapChieuDai() {
        System.out.println("Chieu Dai = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
        sc.close();

    }
    public void nhapChieuRong() {
        System.out.println("Chieu Rong = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
        sc.close();
    }
    public void tinhChuVi() {
        chuVi = 2 * ( dai + rong);
    }
    public void tinhDienTich() {
        dienTich = dai * rong;
    }
    
}
