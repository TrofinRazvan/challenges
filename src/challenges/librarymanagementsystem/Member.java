package challenges.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private String address;
    private String contactInformation;
    List<Book> borrowedBooks;

    public Member(String name, String address, String contactInformation) {
        this.name = name;
        this.address = address;
        this.contactInformation = contactInformation;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowedBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.removeCopy();
            System.out.println(name + " has borrowed the book: " + book.title);
        } else {
            System.out.println("Sorry, the book " + book.title + " is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.addCopy();
            System.out.println(name + " has returned the book: " + book.title);
        } else {
            System.out.println(name + " did not borrow the book " + book.title);
        }
    }

    public void displayBorrowedBooks() {
        System.out.println(name + " 's borrowed books:");
        for (Book book : borrowedBooks) {
            System.out.println(book.title);
        }
    }

    public boolean hasOverdueBooks() {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}