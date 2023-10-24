package UseClass;

import java.util.Scanner;

import BuildClass.VanBan;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap vao xau ky tu: ");
		String xau = sc.nextLine();

		// Khai bao doi tuong
		VanBan noiDung = new VanBan(xau);

		System.out.println("Xau vua nhap la: " + xau);
		System.out.println("Xau chuan hoa la: " + noiDung.chuanHoa(xau));
		System.out.println("So tu cua xau la: " + noiDung.countWordOfString(xau));
		System.out.println("So luong ky tu H la: " + noiDung.countH(xau));

		sc.close();
	}

}
