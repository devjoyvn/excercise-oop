public class Main {

    public static void main(String[] args) {
        Author author = new Author("shareprogramming.net", "nthanhhai2909@gmail.com", "male", 23);
        Book book = new Book("Java OOP", author, 10, 100);
        System.out.println(book.toString());
    }
}
