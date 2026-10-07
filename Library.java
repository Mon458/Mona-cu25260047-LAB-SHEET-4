class Library {
    int booksAvailable;
    static String libraryName = "City Library";

    void issueBook() {
        int issueBooks = 2;

        if (issueBooks <= booksAvailable) {
            booksAvailable = booksAvailable - issueBooks;
            System.out.println("Books Issued: " + issueBooks);
        } else {
            System.out.println("Books not available");
        }
    }

    void returnBook() {
        int returnBooks = 1;

        booksAvailable = booksAvailable + returnBooks;
        System.out.println("Books Returned: " + returnBooks);
    }

    public static void main(String[] args) {
        Library l = new Library();

        int initialBooks = 10;
        l.booksAvailable = initialBooks;

        System.out.println("Library: " + libraryName);
        System.out.println("Initial Books: " + l.booksAvailable);

        l.issueBook();
        System.out.println("Books Available: " + l.booksAvailable);

        l.returnBook();
        System.out.println("Books Available: " + l.booksAvailable);
    }
}
