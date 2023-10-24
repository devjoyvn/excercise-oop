package BuildClass;

import java.util.Scanner;

public class DaGiac {
	// Thuoc tinh
	protected int soCanh;
	protected int[] kichThuoc;
	
	// Phuong thuc
	// Ham khoi tao khong doi so
	public DaGiac() {
		soCanh=0;
		kichThuoc=new int[soCanh];
	}
	
	// Ham khoi tao co doi so
	public DaGiac(int soCanh) {
		this.soCanh=soCanh;
		kichThuoc=new int[soCanh];
	}
	
	// Ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhap vao so canh: ");
		soCanh=sc.nextInt();
		System.out.println("Nhap vao do dai cua cac canh:");
		for(int i=0;i<soCanh;i++) {
			System.out.print("\tNhap canh thu "+(i+1)+": ");
			kichThuoc[i]=sc.nextInt();
		}
	}
	
	// Ham hien thi thong tin
	public void hienThiThongTin() {
		System.out.println("Do dai cac canh la:");
		for(int i=0;i<soCanh;i++) {
			System.out.println("\tCanh thu "+(i+1)+" la: "+kichThuoc[i]);
		}
	}
	
	// Tinh chu vi
	public int tinhCV() {
		int chuVi=0;
		for(int i=0;i<soCanh;i++) {
			chuVi+=kichThuoc[i];
		}
		return chuVi;
	}
}
