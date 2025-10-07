// Topic: Basic Library Management System using Classes and Objects
// Description: Demonstrates how to add, issue, and return books using OOP concepts in Java.

class Library {
    String[] books;
    int noOfBooks;

    Library() {
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    void addBook(String book) {
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println("Book added: " + book);
    }

    void showAvailableBooks() {
        System.out.println("\nAvailable books:");
        for (String book : this.books) {
            if (book == null)
                continue;
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            // Use equals() for string comparison
            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println("The book \"" + book + "\" has been issued.");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("Sorry, the book \"" + book + "\" is not available.");
    }

    void returnBook(String book) {
        addBook(book);
        System.out.println("The book \"" + book + "\" has been returned!");
    }
}

public class C16_CreatingLibrary {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook("OOPS");
        lib.addBook("OS");
        lib.addBook("OOSD");
        lib.addBook("DAA");
        lib.addBook("DBMS");
        lib.addBook("AI");
        lib.addBook("COI");
        lib.addBook("CC");

        lib.showAvailableBooks();

        lib.issueBook("OOPS");
        lib.issueBook("OS");

        lib.showAvailableBooks();

        lib.issueBook("DAA");
        lib.issueBook("COI");

        lib.showAvailableBooks();

        lib.returnBook("OS");
        lib.returnBook("COI");
    }
}
