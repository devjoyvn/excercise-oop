package UseClass;

import java.util.Scanner;

import BuildClass.MaTran;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap vao so hang: ");
		int soHang = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap vao so cot: ");
		int soCot = sc.nextInt();
		sc.nextLine();

		MaTran A = new MaTran(soHang, soCot);

		System.out.println("Nhap vao thong tin cho ma tran A:");
		A.nhapMT(sc);

		MaTran B = new MaTran(soHang, soCot);

		System.out.println("Nhap vao thong tin cho ma tran B:");
		B.nhapMT(sc);

		// Tinh tong
		MaTran C = new MaTran(soHang, soCot);
		C = A.congMT(B);

		// Hien thi ma tran
		System.out.println("Ma tran A la:");
		A.hienThiMT();
		System.out.print("\n");
		System.out.println("Ma tran B la:");
		B.hienThiMT();
		System.out.println("Ma tran C la:");
		C.hienThiMT();

		sc.close();
	}

}
