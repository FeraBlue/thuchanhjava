package Slide79.main;

import Slide79.employee.NhanVienFullTime;
import Slide79.employee.NhanVienPartTime;
import Slide79.util.Configs;

public class App79 {
    
    public static void main(String[] args){
       

        NhanVienFullTime sep = new NhanVienFullTime("Tran Van Sep");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Van Linh"); 
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienFullTime linh2 = new NhanVienFullTime("Le Thi Linh", 3); 
        linh2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
     
        NhanVienPartTime thoiVu = new NhanVienPartTime("Phan Thi Thoi Vu", 240); 


        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        
   
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
}