package b2;

public class Book extends Document {
    private String author;
    private int numerPage;


    public Book(String id, String nxb, int number, String author, int numberPage) {
        super(id, nxb, number);
        this.author = author;
        this.numerPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumerPage() {
        return numerPage;
    }

    public void setNumerPage(int numerPage) {
        this.numerPage = numerPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numerPage=" + numerPage +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
