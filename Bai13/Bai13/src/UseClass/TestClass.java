package UseClass;

import java.util.Scanner;

import BuildClass.QLPTGT;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		QLPTGT ql=new QLPTGT();
		ql.nhapDanhSach(sc);
		ql.hienThiDanhSach();
		
		System.out.print("Nhap vao mau xe can tim: ");
		String mau=sc.nextLine();
		
		ql.timKiem(mau);
		
		sc.close();
	}

}
