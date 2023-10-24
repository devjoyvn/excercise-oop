package BuildClass;

public class HinhTron {
	// Thuoc tinh
	private Diem tam;
	private int bk;

	// Phuong thuc
	public HinhTron() {
		tam = new Diem(0, 0);
		bk = 0;
	}

	public HinhTron(Diem tam, int bk) {
		this.tam = tam;
		this.bk = bk;
	}

	// Tinh Chu vi
	public double tinhCV() {
		return 2 * Math.PI * bk;
	}

	// Tinh Dien tich
	public double tinhDT() {
		return Math.PI * bk * bk;
	}
}
