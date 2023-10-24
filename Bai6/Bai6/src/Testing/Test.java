package Testing;

import java.util.Scanner;

import Class.KhachSan;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		KhachSan ql = new KhachSan();

		ql.nhapDanhSach(sc);

		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd = sc.nextInt();

		System.out.println("==> Tong tien la: " + ql.tinhTien(cmnd));

		sc.close();
	}

}
