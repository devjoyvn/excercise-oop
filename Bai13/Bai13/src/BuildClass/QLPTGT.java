package BuildClass;

import java.util.ArrayList;
import java.util.Scanner;

public class QLPTGT {
	// Thuoc tinh
	private ArrayList<PTGT> ds;
	
	// Phuong thuc
	// Ham khoi tao
	public QLPTGT() {
		ds=new ArrayList<PTGT>(10);
	}
	
	// Ham them 1 pt vao ds
	public void themPTGT(PTGT pt) {
		ds.add(pt);
	}
	
	// Ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc) {
		PTGT pt;
		int chon;
		System.out.print("Nhap vao so luong phuong tien: ");
		int n=sc.nextInt(); sc.nextLine();
		
		System.out.println("Nhap vao danh sach:");
		for(int i=0;i<n;i++) {
			System.out.println("Phuong tien thu "+(i+1)+" la:");
			System.out.print("ban chon phuong tien loai gi (1-OTo; 2-XeMay; 3-XeTai): ");
			chon = sc.nextInt(); sc.nextLine();
			
			switch (chon) {
			case 1:
				pt=new OTo();
				break;
			case 2:
				pt=new XeMay();
				break;
			case 3:
				pt=new XeTai();
				break;

			default:
				pt=new OTo();;
			}
			
			pt.nhapThongTin(sc);
			
			themPTGT(pt);
		}
	}
	
	// Ham hien thi danh sach
	public void hienThiDanhSach() {
		for (PTGT ptgt : ds) {
			ptgt.hienThiThongTin();
		}
	}
	
	// Tim kiem theo mau xe
	public void timKiem(String mauSac) {
		for (PTGT ptgt : ds) {
			if(ptgt.getMau().equals(mauSac)) {
				ptgt.hienThiThongTin();
			}
		}
	}
}
