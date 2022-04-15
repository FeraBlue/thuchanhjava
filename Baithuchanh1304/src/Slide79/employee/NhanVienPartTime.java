package Slide79.employee;


public class NhanVienPartTime extends NhanVien {
    private int gioLamviec; 
    public NhanVienPartTime(String ten, int gioLamviec) {
        this.ten = ten;
        this.gioLamviec = gioLamviec;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien thoi vu";
    }

    public void tinhLuong() {
        luong = Slide79.util.Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamviec;
    }
}