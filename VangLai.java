public class VangLai extends HoaDon {
    public VangLai(String maSo, String hoTen, String ngayLap, String matHang, int soLuong, double donGia) {
        super(maSo, hoTen, ngayLap, matHang, soLuong, donGia);
    }

    public double tienKM() {
        if (thanhTien() > 1000000)
            return thanhTien() * 0.03;
        return 0;

    }

    public String toString() {
        return super.toString();
    }
}
