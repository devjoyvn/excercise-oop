package BuildClass;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi;
	private int chiSoCu;
	private double tien;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi, int chiSoCu, double tien) {
		this.chiSoMoi = chiSoMoi;
		this.chiSoCu = chiSoCu;
		this.tien = tien;
	}

	public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
		this.tenChuHo = tenChuHo;
		this.chiSoMoi = chiSoMoi;
		this.chiSoCu = chiSoCu;
		this.tien = tien;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu = sc.nextInt();
		sc.nextLine();
		tien = (chiSoMoi - chiSoCu) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi);
		System.out.println("\tChi so cu: " + chiSoCu);
		System.out.println("\tTien: : " + tien);
	}
}
