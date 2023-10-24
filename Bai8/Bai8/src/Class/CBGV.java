package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung;
	private double thuong;
	private double phat;
	private double luongThucLinh;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat = sc.nextDouble();
		sc.nextLine();

		// tinh luong
		luongThucLinh = luongCung + thuong - phat;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung);
		System.out.println("\tThuong: " + thuong);
		System.out.println("\tPhat: " + phat);
		System.out.println("\tLuong thuc linh: " + luongThucLinh);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh;
	}
}
