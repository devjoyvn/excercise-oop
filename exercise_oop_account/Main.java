public class Main {

    public static void main(String[] args) {
        Account a = new Account(1, "A", 50);
        Account b = new Account(1, "B", 10);

        System.out.println("Balance A: " + a.getBalance());
        System.out.println("Balance B: " + b.getBalance());
        System.out.println();

        // Cong tien vao tai khoan
        a.credit(30);
        System.out.println("Balance A: " + a.getBalance());
        System.out.println("Balance B: " + b.getBalance());
        System.out.println();

        // Tru tien vao tai khoan
        a.debit(20);
        System.out.println("Balance A: " + a.getBalance());
        System.out.println("Balance B: " + b.getBalance());
        System.out.println();

        // Tru tien vao tai khoan khong hop le
        a.debit(1000);
        System.out.println("Balance A: " + a.getBalance());
        System.out.println("Balance B: " + b.getBalance());
        System.out.println();

        // Chuyen tien cho b
        a.tranferTo(b, 10);
        System.out.println("Balance A: " + a.getBalance());
        System.out.println("Balance B: " + b.getBalance());
        System.out.println();
    }
}
