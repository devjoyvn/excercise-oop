package UseClass;

import java.text.DecimalFormat;

import BuildClass.Diem;
import BuildClass.TamGiac;

public class TestClass {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat(".##");
		
		// Khai bao doi tuong
		Diem A = new Diem(0, 0);
		Diem B = new Diem(2, 1);
		Diem C = new Diem(-4, 5);
		TamGiac tg = new TamGiac(A, B, C);

		System.out.println("Chu vi hinh tam giac la: " + df.format(tg.tinhCV()));
		System.out.println("Dien tich hinh tam giac la: " + df.format(tg.tinhDT()));
	}

}
