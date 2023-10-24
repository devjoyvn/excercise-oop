package Class;

import java.util.Scanner;

public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu;
	private String tenNXB;
	private int soBanPhatHanh;

	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {

	}

	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
		this.maTaiLieu = maTaiLieu;
		this.tenNXB = tenNXB;
		this.soBanPhatHanh = soBanPhatHanh;
	}

	// nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh = sc.nextInt();
		sc.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu);
		System.out.println("\tTen nha xuat ban: " + tenNXB);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh);
	}

	// ham lay ra ma tai lieu
	public String getMaTaiLieu() {
		return maTaiLieu;
	}
}
