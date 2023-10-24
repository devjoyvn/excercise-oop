package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	// thuoc tinh
	private int soNguoi;
	private int soNha;
	private Nguoi[] list; // list la mang danh sach chua cac thanh vien trong ho

	// phuong thuc
	// ham khoi tao khong doi so
	public HoDan() {
		list = new Nguoi[10];
	}

	// ham khoi tao co doi so
	public HoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi, int soNha) {
		super(hoTen, ngaySinh, ngheNghiep);
		this.soNguoi = soNguoi;
		this.soNha = soNha;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i = 0; i < soNguoi; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list[i] = new Nguoi();
			list[i].nhapThongTin(sc);
		}
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi);
		System.out.println("\tSo nha: " + soNha);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i = 0; i < soNguoi; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list[i].hienThiThongTin();
		}
	}

	// ham lay ra thanh vien trong ho dan
	public Nguoi[] getList() {
		return list;
	}

	// ham lay ra so thanh vien trong ho gia dinh
	public int getSoNguoi() {
		return soNguoi;
	}
}
