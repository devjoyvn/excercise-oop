package BuildClass;

import java.util.Scanner;

public class XeMay extends PTGT {
	// Thuoc tinh
	private int congSuat;
	
	// Phuong thuc
	// Ham khoi tao khong doi so
	public XeMay() {
		
	}
	
	// Ham khoi tao co doi so
	public XeMay(int congSuat) {
		this.congSuat=congSuat;
	}
	
	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap vao Cong suat: ");
		congSuat=sc.nextInt();sc.nextLine();
	}
	
	// Ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tCong suat: "+congSuat);
	}
}
