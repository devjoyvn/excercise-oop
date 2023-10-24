package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
	// thuoc tinh
	private String congViec;

	// phuong thuc
	// ham khoi tao khong doi so
	public NhanVien() {

	}

	// ham khoi tao co doi so
	public NhanVien(String hoten, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.congViec = congViec;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap cong viec: ");
		congViec = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tCong viec: " + congViec);
	}
}
