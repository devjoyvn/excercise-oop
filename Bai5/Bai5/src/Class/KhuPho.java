package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
	// thuoc tinh
	private ArrayList<HoDan> dshd;

	// phuong thuc
	// ham khoi tao
	public KhuPho() {
		dshd = new ArrayList<HoDan>(10);
	}

	// ham them 1 ho dan
	public void themHoDan(HoDan hoDan) {
		dshd.add(hoDan);
	}

	// ham nhap vao danh sach ho dan
	public void nhapDanhSach(Scanner sc) {
		HoDan hoDan;

		System.out.print("Nhap vao so ho dan: ");
		int soHoDan = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i = 0; i < soHoDan; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			hoDan = new HoDan();
			hoDan.nhapThongTin(sc);
			themHoDan(hoDan);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		int n = dshd.size();

		for (int i = 0; i < n; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			dshd.get(i).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin() {
		// lay ra duoc nam hien tai
		Date now = new Date();
		int namHienTai = now.getYear() + 1900;

		Nguoi[] dstv = null;

		for (HoDan hoDan : dshd) {
			dstv = hoDan.getList();
			for (int i = 0; i < hoDan.getSoNguoi(); i++) {
				if (namHienTai - (dstv[i].getNgaySinh().getYear() + 1900) == 80) {
					hoDan.hienThiThongTin();
				}
			}
		}
	}
}
