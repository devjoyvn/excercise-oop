package b8;

public class Card {
    private Student student;
    private String id;
    private int borrowDate;
    private int paymentDate;
    private int bookId;

    public Card(Student student, String id, int borrowDate, int paymentDate, int bookId) {
        this.student = student;
        this.id = id;
        this.borrowDate = borrowDate;
        this.paymentDate = paymentDate;
        this.bookId = bookId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(int paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
