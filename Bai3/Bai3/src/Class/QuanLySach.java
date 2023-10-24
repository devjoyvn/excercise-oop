package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
	// thuoc tinh
	private ArrayList<TaiLieu> dstl;

	// phuong thuc
	// ham khoi tao
	public QuanLySach() {
		dstl = new ArrayList<TaiLieu>(10);
	}

	// them moi 1 tai lieu
	public void themTaiLieu(TaiLieu tl) {
		dstl.add(tl);
	}

	public void inDanhSachTL() {
		for (TaiLieu taiLieu : dstl) {
			System.out.println(taiLieu);
		}
	}
	// nhap danh sach tai lieu
	public void nhapDanhSachTL(Scanner sc) {
		int chon;
		String stop;
		TaiLieu tl;

		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
			chon = sc.nextInt();
			sc.nextLine();

			switch (chon) {
			case 1:
				tl = new Sach();
				break;
			case 2:
				tl = new TapChi();
				break;
			case 3:
				tl = new Bao();
				break;

			default:
				tl = new Sach();
				break;
			}

			tl.nhapThongTin(sc);
			inDanhSachTL();
			themTaiLieu(tl);
			System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
			stop = sc.nextLine();
		} while (stop.equals("c"));
	}

	// tim kiem theo ma tai lieu
	public void timMaTL(String maTL) {
		for (TaiLieu tl : dstl) {
			if (maTL.equals(tl.getMaTaiLieu())) {
				tl.hienThiThongTin();
			}
		}
	}

	// tim kiem theo loai tai lieu
	public void timLoaiTL(String loai) {
		for (TaiLieu tl : dstl) {
			if (loai.equals("Sach") && (tl instanceof Sach)) {
				tl.hienThiThongTin();
			} else if (loai.equals("TapChi") && (tl instanceof TapChi)) {
				tl.hienThiThongTin();
			} else if (loai.equals("Bao") && (tl instanceof Bao)) {
				tl.hienThiThongTin();
			}
		}
	}
}
