class Book {
    String title;
    String author;
    double price;
    static String publisher = "ABC Publishers";

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisher);
    }

    public static void main(String[] args) {
        Book b = new Book();

        String bookTitle = "Java Basics";
        String bookAuthor = "James";
        double bookPrice = 450;

        b.title = bookTitle;
        b.author = bookAuthor;
        b.price = bookPrice;

        b.display();
    }
}
