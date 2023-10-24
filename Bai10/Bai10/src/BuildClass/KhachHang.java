package BuildClass;

import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo;
	protected int soNha;
	protected String maCongTo;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo, int soNha, String maCongTo) {
		this.tenChuHo = tenChuHo;
		this.soNha = soNha;
		this.maCongTo = maCongTo;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo = sc.nextLine();
	}

	// Hm hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo);
		System.out.println("\tSo nha: " + soNha);
		System.out.println("\tMa cong to: " + maCongTo);
	}
}
