package Class;

import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	protected String hoTen;
	protected String maSV;
	protected String ngaySinh;
	protected String lop;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
		this.hoTen = hoTen;
		this.maSV = maSV;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen);
		System.out.println("\tNgay sinh: " + ngaySinh);
		System.out.println("\tMa sinh vien: " + maSV);
		System.out.println("\tLop: " + lop);
	}
}
