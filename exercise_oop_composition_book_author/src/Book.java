
public class Book {
    private String name;
    private Author author;
    private double price;
    private int count;

    public Book(String name, Author author, double price, int count) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int count() {
        return count;
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author.getName() +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
