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
}