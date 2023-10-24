package BuildClass;

import java.util.Scanner;

public class XeTai extends PTGT {
	// Thuoc tinh
	private double trongTai;	
	
	// Phuong thuc
	// Ham khoi tao khong doi so
	public XeTai() {
		
	}
	
	// Ham khoi tao co doi so
	public XeTai(double trongTai) {
		this.trongTai=trongTai;
	}
	
	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap vao trong tai: ");
		trongTai=sc.nextDouble(); sc.nextLine();
	}
	
	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTrong tai: "+trongTai);
	}
}
