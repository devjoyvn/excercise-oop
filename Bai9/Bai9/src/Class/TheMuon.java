package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	// thuoc tinh
	private int soMuon;
	private Date ngayMuon;
	private Date hanTra;
	private String soHieu;

	// phuong thuc
	// ham khoi tao khong doi so
	public TheMuon() {

	}

	// ham khoi tao co doi so
	public TheMuon(int soMuon, Date ngayMuon, String soHieu) {
		this.soMuon = soMuon;
		this.ngayMuon = ngayMuon;
		this.soHieu = soHieu;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so muon: ");
		soMuon = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon = strToDate(strNgayMuon);

		String strNgayTra = "31-12-2020";
		hanTra = strToDate(strNgayTra);

		System.out.println("\tNhap so hieu: ");
		soHieu = sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon);
		System.out.println("\tNgay muon: " + ngayMuon);
		System.out.println("\tHan tra: " + hanTra);
		System.out.println("\tSo hieu: " + soHieu);
	}

	// ham lay ra thong tin ve han tra
	public Date getHanTra() {
		return hanTra;
	}
}
