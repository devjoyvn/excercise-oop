package BuildClass;

import java.util.Scanner;

public class OTo extends PTGT {
	// Thuoc tinh
	private int soCho;
	private String kieuDongCo;
	
	// Phuong thuc
	public OTo() {
		
	}
	
	public OTo(int soCho, String kieuDongCo) {
		this.soCho=soCho;
		this.kieuDongCo=kieuDongCo;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so cho: ");
		soCho=sc.nextInt();
		System.out.print("\tNhap kieu dong co: ");
		kieuDongCo=sc.nextLine();
	}
	
	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo cho: "+soCho);
		System.out.println("\tKieu dong co: "+kieuDongCo);
	}
}
