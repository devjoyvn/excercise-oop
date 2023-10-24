package Class;

import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen;
	protected String ngaySinh;
	protected String queQuan;

	// phuong thuc
	// ham khoi tao khong so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen);
		System.out.println("\tNgay sinh: " + ngaySinh);
		System.out.println("\tQue quan: " + queQuan);
	}
}
