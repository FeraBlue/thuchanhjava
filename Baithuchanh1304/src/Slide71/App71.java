package Slide71;

public class App71 {
    
    public static void main (String[] args) {
        HinhTron hinhTron = new HinhTron();
        hinhTron.setBanKinh(10);
        float chuVi = hinhTron.tinhChuVi();
        float dienTinh = hinhTron.tinhDienTich();
        System.out.println("Chu vi hinh tron: "+ chuVi + "; va dien tich: " +dienTinh);
    }
}