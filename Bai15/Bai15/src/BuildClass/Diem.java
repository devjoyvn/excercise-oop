package BuildClass;

import java.lang.Math;

public class Diem {
	// Thuoc tinh
	private double x;
	private double y;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public Diem() {
		x = 0;
		y = 0;
	}

	// Ham khoi tao co doi so
	public Diem(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// getter va setter cho x
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	// getter va setter cho y
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// Ham hien thi diem
	public void hienThiDiem() {
		System.out.println("(" + x + "; " + y + ")");
	}

	// Ham tinh khoang cach giua 2 diem
	public double tinhKC(Diem d2) {
		return Math.sqrt((x - d2.x) * (x - d2.x) + (y - d2.y) * (y - d2.y));
	}
}
