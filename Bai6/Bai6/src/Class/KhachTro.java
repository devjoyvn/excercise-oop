package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro;
	private String loaiPhong;
	private double giaPhong;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhachTro() {

	}

	// ham khoi tao co doi so
	public KhachTro(String hoTen, int CMND, int soNgayTro, String loaiPhong, double giaPhong) {
		this.hoTen = hoTen;
		this.CMND = CMND;
		this.soNgayTro = soNgayTro;
		this.loaiPhong = loaiPhong;
		this.giaPhong = giaPhong;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong = sc.nextDouble();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro);
		System.out.println("\tLoai phong: " + loaiPhong);
		System.out.println("\tGia phong: " + giaPhong);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro() {
		return soNgayTro;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong() {
		return giaPhong;
	}
}
