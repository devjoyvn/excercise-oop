package BuildClass;

import java.lang.Math;

public class TamGiac extends DaGiac {
	// Thuoc tinh
	
	
	// Phuong thuc
	// Ham khoi tao khong doi so
	public TamGiac() {
		soCanh=3;
		kichThuoc=new int[3];
	}
	
	// Chu vi
	public int tinhCV() {
		int chuVi=0;
		for(int i=0;i<3;i++) {
			chuVi+=kichThuoc[i];
		}
		return chuVi;
	}
	
	// Dien tich
	public double tinhDT() {
		double p=tinhDT()/2;
		return Math.sqrt(p*(p-kichThuoc[0])*(p-kichThuoc[1])*(p-kichThuoc[2]));
	}
	
	// Kiem tra dieu kien tam giac
	public boolean ktTG() {
		int a=kichThuoc[0];
		int b=kichThuoc[1];
		int c=kichThuoc[2];
		
		if((a+b>c) && (a+c>b) && (b+c>a)) {
			return true;
		}
		
		return false;
	}
	
	// Hien thi
	public void display() {
		System.out.println(kichThuoc[0]+", "+kichThuoc[1]+", "+kichThuoc[2]);
	}
}
