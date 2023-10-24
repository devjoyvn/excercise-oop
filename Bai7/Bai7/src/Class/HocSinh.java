package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop;
	private String khoHoc;
	private String kyHoc;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen, String lop, String khoaHoc, String kyHoc) {
		this.hoTen = hoTen;
		this.lop = lop;
		this.khoHoc = khoaHoc;
		this.kyHoc = kyHoc;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop);
		System.out.println("\tKhoa hoc: " + khoHoc);
		System.out.println("\tKy hoc: " + kyHoc);
	}

	// ham lay ra thong tin ve lop
	public String getLop() {
		return lop;
	}
}
