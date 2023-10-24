package Class;

import java.util.Scanner;

public class CanBo {
	// thuoc tinh
	private String hoTen;
	private String ngaySinh;
	private String gioiTinh;
	private String diaChi;

	// phuong thuc
	// ham khoi tao khong doi so
	public CanBo() {

	}

	// ham khoi tao co doi so
	public CanBo(String hoten, String ngaySinh, String gioiTinh, String diaChi) {
		this.hoTen = hoten;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh = sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen);
		System.out.println("\tNgay sinh: " + ngaySinh);
		System.out.println("\tGioi tinh: " + gioiTinh);
		System.out.println("\tDia chi: " + diaChi);
	}

	// ham lay thong tin ho ten
	public String getHoTen() {
		return this.hoTen;
	}
}
