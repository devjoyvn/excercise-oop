package BuildClass;

import java.util.Scanner;

public class PTGT {
	// Thuoc tinh
	protected String hangSX;
	protected int namSX;
	protected double gia;
	protected String mau;
	
	// Phuong thuc
	// Ham khoi tao khong doi so
	public PTGT() {
		
	}
	
	// Ham khoi tao co doi so
	public PTGT(String hangSX, int namSX, double gia, String mau) {
		this.hangSX=hangSX;
		this.namSX=namSX;
		this.gia=gia;
		this.mau=mau;
	}
	
	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap vao hang san xuat: ");
		hangSX=sc.nextLine();
		System.out.print("\tNhap vao nam san xuat: ");
		namSX=sc.nextInt(); sc.nextLine();
		System.out.print("\tNhap vao gia: ");
		gia=sc.nextDouble(); sc.nextLine();
		System.out.print("\tNhap vao mau sac: ");
		mau=sc.nextLine();
	}
	
	// Ham hien thi thong tin
	public void hienThiThongTin() {
		System.out.println("\tHang san xuat: "+hangSX);
		System.out.println("\tNam san xuat: "+namSX);
		System.out.println("\tGia: "+gia);
		System.out.println("\tMau: "+mau);
	}
	
	// Ham lay mau xe
	public String getMau() {
		return mau;
	}
}
