package BuildClass;

import java.util.Scanner;

public class MaTran {
	// Thuoc tinh
	private int soHang;
	private int soCot;
	private int[][] matran;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public MaTran() {
		soHang = 0;
		soCot = 0;
		matran = new int[soHang][soCot];
	}

	// Ham khoi tao co doi so
	public MaTran(int soHang, int soCot) {
		this.soHang = soHang;
		this.soCot = soCot;
		matran = new int[soHang][soCot];
	}

	// Ham nhap vao ma tran
	public void nhapMT(Scanner sc) {
		for (int i = 0; i < soHang; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("Phan tu thu [" + (i + 1) + "][" + (j + 1) + "] = ");
				matran[i][j] = sc.nextInt();
				sc.nextLine();
			}
		}
	}

	// Ham hien thi ma tran
	public void hienThiMT() {
		for (int i = 0; i < soHang; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(matran[i][j] + "\t");
			}

			// Xuong dong
			System.out.print("\n");
		}
	}

	// Ham tinh tong 2 ma tran
	public MaTran congMT(MaTran mt2) {
		MaTran Tong = new MaTran(this.soHang, this.soCot);

		for (int i = 0; i < soHang; i++) {
			for (int j = 0; j < soCot; j++) {
				Tong.matran[i][j] = this.matran[i][j] + mt2.matran[i][j];
			}
		}

		return Tong;
	}

	// Ham nhan ma tran
	public MaTran nhanMT(MaTran mt2) {
		MaTran Tich = new MaTran(this.soHang, this.soCot);

		for (int i = 0; i < soHang; i++) {
			for (int j = 0; j < soCot; j++) {
				Tich.matran[i][j] = 0;
				for (int k = 0; k < soCot; k++) {
					Tich.matran[i][j] += this.matran[i][k] * mt2.matran[k][j];
				}
			}
		}

		return Tich;
	}
}
