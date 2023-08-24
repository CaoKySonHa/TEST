import java.io.*;
import java.util.*;

public class DS {
    private Vector<HoaDon> v = new Vector<HoaDon>();

    public DS(int n, String fn) {
        try {
            FileWriter fw = new FileWriter(fn);
            BufferedWriter bw = new BufferedWriter(fw);
            String ma, ten, ngay, matHang;
            int sl;
            double dg;
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < n; ++i) {
                System.out.println("Hoa don [" + (i + 1) + "] : ");
                ma = sc.nextLine();
                ten = sc.nextLine();
                ngay = sc.nextLine();
                matHang = sc.nextLine();
                sl = sc.nextInt();
                sc.nextLine();
                dg = sc.nextDouble();
                sc.nextLine();
                bw.write(ma + "\t" + ten + "\t" + ngay + "\t" + matHang + "\t" + sl + "\t" + dg + "\n");
            }
            bw.close();
        } catch (Exception ex) {
            ;
        }
    }

    public DS(String fn) {
        try {
            FileReader fr = new FileReader(fn);
            BufferedReader br = new BufferedReader(fr);
            String s;
            String[] t;
            HoaDon p;
            while (true) {
                s = br.readLine();
                if (s == null)
                    break;
                t = s.split("\t");
                if (t[0].equals("1")) {
                    p = new VIP(t[0], t[1], t[2], t[3], Integer.parseInt(t[4]), Double.parseDouble(t[5]));

                } else if (t[0].equals("2")) {
                    p = new ThanThiet(t[0], t[1], t[2], t[3], Integer.parseInt(t[4]), Double.parseDouble(t[5]));

                } else {
                    p = new VangLai(t[0], t[1], t[2], t[3], Integer.parseInt(t[4]), Double.parseDouble(t[5]));
                }

                v.add(p);
            }
        } catch (IOException ex) {
            ;
        }
    }

    public void output() {
        for (int i = 0; i < v.size(); ++i) {
            System.out.println(v.get(i));
        }
    }

    public double tong() {
        double sum = 0;
        for (int i = 0; i < v.size(); ++i) {
            sum += v.get(i).tongTien();
        }
        return sum;
    }

    public void tongTienCaoNhat() {
        double max = v.get(0).tongTien();
        for (int i = 0; i < v.size(); ++i) {
            if (max < v.get(i).tongTien()) {
                max = v.get(i).tongTien();
            }
        }
        for (int i = 0; i < v.size(); ++i) {
            if (v.get(i).tongTien() == max) {
                System.out.println(v.get(i));
            }
        }
    }

    public int dem() {
        int count = 0;
        for (int i = 0; i < v.size(); ++i) {
            if (v.get(i) instanceof VIP) {
                count++;
            }
            if (v.get(i) instanceof ThanThiet) {
                count++;
            }
        }
        return count;
    }

    public void sapXep() {
        for (int i = 0; i < v.size() - 1; i++) {
            for (int j = i; j < v.size(); j++) {
                if (v.get(i).tongTien() > v.get(j).tongTien()) {
                    HoaDon temp1 = v.get(i);
                    HoaDon temp2 = v.get(j);

                    v.add(j, temp1);
                    v.remove(j + 1);
                    v.add(i + 1, temp2);
                    v.remove(i);

                } else if (v.get(i).tongTien() == v.get(j).tongTien()) {
                    if (v.get(i).getMS().compareTo(v.get(j).getMS()) < 0) {
                        HoaDon temp1 = v.get(i);
                        HoaDon temp2 = v.get(j);

                        v.add(j, temp1);
                        v.remove(j + 1);
                        v.add(i + 1, temp2);
                        v.remove(i);
                    }
                }
            }
        }
        output();
    }

    public static void main(String[] args) {
        // DS d = new DS(7, "Danhsach.txt");
        DS d = new DS("Danhsach.txt");
        d.output();
        System.out.println("Tong: " + d.tong());
        d.tongTienCaoNhat();
        System.out.println("Dem: " + d.dem());
        d.sapXep();
    }
}
