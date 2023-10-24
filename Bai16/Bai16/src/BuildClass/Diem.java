package BuildClass;

import java.lang.Math;

public class Diem {
	// Thuoc tinh
	private double x;
	private double y;

	// Phuong thuc
	public Diem() {
		this.x = 0;
		this.y = 0;
	}

	public Diem(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// Hien thi thong tin cua diem
	public void hienThiDiem() {
		System.out.println("(" + x + "; " + y + ")");
	}

	// Tinh khoang cach giua 2 diem
	public double tinhKC(Diem d2) {
		return Math.sqrt((x - d2.x) * (x - d2.x) + (y - d2.y) * (y - d2.y));
	}
}
