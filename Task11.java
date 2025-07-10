public class Task11 {

    static class Book {
        private String title;
        private String author;
        private int yearPublished;
        private double price;

        // Constructor
        public Book(String title, String author, int yearPublished, double price) {
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
            this.price = price;
        }

        // toString method to return formatted book details
        public String toString() {
            return "Title: \"" + title + "\"\n"
                 + "Author: \"" + author + "\"\n"
                 + "Year Published: " + yearPublished + "\n"
                 + "Price: $" + String.format("%.2f", price);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book 1:");
        System.out.println(book1 + "\n");

        System.out.println("Book 2:");
        System.out.println(book2 + "\n");

        System.out.println("Book 3:");
        System.out.println(book3);
    }
}
