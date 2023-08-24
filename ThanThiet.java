public class ThanThiet extends HoaDon implements NgoaiRa {
    public ThanThiet(String maSo, String hoTen, String ngayLap, String matHang, int soLuong, double donGia) {
        super(maSo, hoTen, ngayLap, matHang, soLuong, donGia);
    }

    public double tienKM() {
        if (soLuong > 60) {
            return thanhTien() * 0.04;
        }
        if (soLuong <= 50 && thanhTien() >= 800000) {
            return thanhTien() * 0.03;
        }
        return 0;
    }

    public double ThanhToanTamUng() {
        return 0.6 * tongTien();
    }

    public double LaiSuatTraCham() {
        return 0.03 * (tongTien() - ThanhToanTamUng());
    }

    public String toString() {
        return super.toString() + ", " + ThanhToanTamUng() + ", " + LaiSuatTraCham();
    }

}
