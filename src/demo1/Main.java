// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package demo1;
public class Main {
    public static void main(String[] args) {
        // Tạo sản phẩm và kiểm thử các phương thức
        Product sp = new Product("SP001", "Sản phẩm test", 100.0, 10, "Cái");

        sp.InThongTin();
        sp.KiemTraHang();

        sp.TangSoLuong(5);
        sp.GiamSoLuong(3);
        sp.ThayDoiGiaTien(150.0);

        sp.InThongTin();
        sp.KiemTraHang();
    }
    }

