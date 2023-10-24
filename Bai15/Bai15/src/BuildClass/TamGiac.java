package BuildClass;

public class TamGiac {
	// Thuoc tinh
	private Diem A;
	private Diem B;
	private Diem C;
	
	// Phuong thuc
	// Ham khoi tao
	public TamGiac() {
		
	}
	
	public TamGiac(Diem d1, Diem d2, Diem d3) {
		A=d1;
		B=d2;
		C=d3;
	}
	
	// Ham tinh chu vi hinh tam giac
	public double tinhCV() {
		double AB=A.tinhKC(B);
		double AC=A.tinhKC(C);
		double BC=B.tinhKC(C);
		
		return (AB+AC+BC);
	}
	
	// Ham tinh dien tich
	public double tinhDT() {
		double AB=A.tinhKC(B);
		double AC=A.tinhKC(C);
		double BC=B.tinhKC(C);
		
		double p=(AB+AC+BC)/2;
		
		return Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
	}
}
