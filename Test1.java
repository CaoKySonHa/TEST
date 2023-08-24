public class Test1 {
    public static void main(String[] args) {
        HoaDon v = new VIP("01", "Nguyen Van A", "01/07/2004", "Coca", 60, 15000);
        HoaDon t = new ThanThiet("02", "Nguyen Van B", "3/2/2020", "Pepsi", 100, 100000);
        HoaDon vl = new VangLai("03", "Dao Thi C", "20/8/2030", "7Up", 50, 150000);
        System.out.println(v);
        System.out.println(t);
        System.out.println(vl);

    }
}
