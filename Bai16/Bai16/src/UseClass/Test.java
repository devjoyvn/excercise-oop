package UseClass;

import java.text.DecimalFormat;

import BuildClass.Diem;
import BuildClass.HinhTron;

public class Test {

	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat(".##");
		
		Diem I=new Diem(1, 2);
		int r=10;
		
		HinhTron O=new HinhTron(I, r);
		
		System.out.println("Chu vi hinh tron la: "+df.format(O.tinhCV()));
		System.out.println("Dien tich hinh tron la: "+df.format(O.tinhDT()));
	}

}
