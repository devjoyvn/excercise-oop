package BuildClass;

public class VanBan {
	// Thuoc tinh
	private String noiDung;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public VanBan() {

	}

	// Ham khoi tao co doi so
	public VanBan(String noiDung) {
		this.noiDung = noiDung;
	}

	// Ham dem so tu trong 1 xau
	public int countWordOfString(String xau) {
		final char SPACE = ' ';
		final char TAB = '\t';
		final char BREAK_LINE = '\n';

		if (xau == null) {
			return -1;
		}

		int count = 0;
		int n = xau.length();
		boolean notCounted = true;

		for (int i = 0; i < n; i++) {
			if ((xau.charAt(i) != SPACE) && (xau.charAt(i) != TAB) && (xau.charAt(i) != BREAK_LINE)) {
				if (notCounted) {
					count++;
					notCounted = false;

					// Duyet tu dau den cuoi xau, trung nao chua het 1 tu thi van con duyet ky tu
					// Khi het 1 tu thi tang count len 1 don vi
				}
			} else {
				notCounted = true;
			}
		}

		return count;
	}

	// Ham chuan hoa xau
	public String chuanHoa(String xau) {
		String xauOK = xau.trim(); // Loai bo ky tu trang o dau va cuoi xau

		// Loai bo khoang o giua xau
		while (xauOK.indexOf("  ") != -1) {
			xauOK = xauOK.replaceAll("  ", " ");
		}

		return xau;
	}

	// Ham dem ky tu h
	public int countH(String xau) {
		int count = 0;

		int n = xau.length();
		for (int i = 0; i < n; i++) {
			if ((xau.charAt(i) == 'h') || (xau.charAt(i) == 'H')) {
				count++;
			}
		}

		return count;
	}
}
