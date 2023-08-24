public class VIP extends HoaDon implements NgoaiRa {
    public VIP(String maSo, String hoTen, String ngayLap, String matHang, int soLuong, double donGia) {
        super(maSo, hoTen, ngayLap, matHang, soLuong, donGia);
    }

    public double tienKM() {
        if (soLuong > 50) {
            return thanhTien() * 0.05;
        } else if (thanhTien() >= 600000) {
            return thanhTien() * 0.04;
        } else if (soLuong >= 10)
            return thanhTien() * 0.01;
        return 0;

    }

    public double ThanhToanTamUng() {
        return tongTien() * 0.4;
    }

    public double LaiSuatTraCham() {
        return 0.02 * (tongTien() - ThanhToanTamUng());
    }

    public String toString() {
        return super.toString() + ", " + ThanhToanTamUng() + ", " + LaiSuatTraCham();
    }

}
