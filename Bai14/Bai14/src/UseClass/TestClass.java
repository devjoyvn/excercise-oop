package UseClass;

import java.util.ArrayList;
import java.util.Scanner;

import BuildClass.TamGiac;

public class TestClass {
	// Thuoc tinh
	private ArrayList<TamGiac> ds;
	
	// Phuong thuc
	public TestClass() {
		ds=new ArrayList<TamGiac>(10);
	}
	
	// Them tg
	public void themTG(TamGiac tg) {
		ds.add(tg);
	}
	
	// Nhap danh sach
	public void nhapDS(Scanner sc) {
		TamGiac tg;
		System.out.print("Nhap vao so luong tam giac: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Tam giac thu "+(i+1)+" la:");
			do {
				tg=new TamGiac();
				tg.nhapThongTin(sc);
				if(tg.ktTG()==false) {
					System.out.println("Ban nhap sai roi. Hay nhap la!");
				}
			} while(tg.ktTG()==false);
			
			themTG(tg);
		}
	}
	
	// Tim tg co dien tich lon nhat
	public void timMaxTG() {
		double max=ds.get(0).tinhDT();
		for(int i=1;i<ds.size();i++) {
			if(max<ds.get(i).tinhDT()) {
				max=ds.get(i).tinhDT();
			}
		}
		
		for (TamGiac tamGiac : ds) {
			if(max==tamGiac.tinhDT()) {
				tamGiac.display();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		TestClass ql=new TestClass();
		ql.nhapDS(sc);
		
		System.out.println("\nTam giac co dien tich lon nhat la:");
		ql.timMaxTG();
		
		sc.close();
	}

}
