package demo1;

public class Product {
    private String maSp;
    private String tenSp;
    private double giaTien;
    private int soLuong;
    private String donVi;

    // Phương thức khởi tạo
    Product(String maSp, String tenSp, double giaTien, int soLuong, String donVi) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        this.donVi = donVi;
    }
    // Phương thức tăng số lượng
    void TangSoLuong(int soLuongTang) {
        this.soLuong += soLuongTang;
        System.out.println("Số lượng sản phẩm đã được tăng lên: " + soLuong);
    }

    // Phương thức giảm số lượng
    void GiamSoLuong(int soLuongGiam) {
        if (this.soLuong >= soLuongGiam) {
            this.soLuong -= soLuongGiam;
            System.out.println("Số lượng sản phẩm đã được giảm xuống: " + soLuong);
        } else {
            System.out.println("Không đủ hàng để giảm");
        }
    }

    // Phương thức thay đổi giá tiền sản phẩm
    void ThayDoiGiaTien(double giaTienMoi) {
        this.giaTien = giaTienMoi;
        System.out.println("Giá tiền sản phẩm đã được thay đổi thành: " + giaTien);
    }

    // Phương thức kiểm tra hàng còn/hết hàng
    void KiemTraHang() {
        if (this.soLuong > 0) {
            System.out.println("Còn hàng");
        } else {
            System.out.println("Hết hàng");
        }
    }

    // Phương thức in thông tin sản phẩm
    void InThongTin() {
        System.out.println("Mã SP: " + maSp);
        System.out.println("Tên SP: " + tenSp);
        System.out.println("Giá tiền: " + giaTien);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Đơn vị: " + donVi);
    }
}
