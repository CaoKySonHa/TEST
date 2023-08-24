public abstract class HoaDon {
    protected String maSo, hoTen, ngayLap, matHang;
    protected int soLuong;
    protected double donGia;

    public HoaDon(String maSo, String hoTen, String ngayLap, String matHang, int soLuong, double donGia) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.ngayLap = ngayLap;
        this.matHang = matHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMS() {
        return maSo;
    }

    public abstract double tienKM();

    public double thanhTien() {
        return soLuong * donGia;
    }

    public double tongTien() {
        return thanhTien() - tienKM();
    }

    public String toString() {
        return "MaSo: " + maSo + ", hoten: " + hoTen + ", ngaylap: " + ngayLap + ", mathang: " + matHang
                + ", so luong: " + soLuong + ", dongia: " + donGia + ", tong: "
                + tongTien();
    }
}