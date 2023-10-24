package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	// thuoc tinh
	private String mon1;
	private String mon2;
	private String mon3;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiA() {

	}

	// ham khoi tao co doi so
	public KhoiA(String mon1, String mon2, String mon3) {
		this.mon1 = mon1;
		this.mon2 = mon2;
		this.mon3 = mon3;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1 + " - " + mon2 + " - " + mon3);
	}
}
