package challenges.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author + ", ISBN: " + book.ISBN);
        }
    }

    public List<Book> searchBooks(String keyword) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (containsIgnoreCase(book.title, keyword) || containsIgnoreCase(book.author, keyword)
                    || containsIgnoreCase(String.valueOf(book.ISBN), keyword)) {
                result.add(book);
            }
        }
        return result;
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void displayAllMembers() {
        for (Member member : members) {
            System.out.println(member.getName());
        }
    }

    public static boolean containsIgnoreCase(String source, String keyword) {
        return source.toLowerCase().contains(keyword.toLowerCase());
    }
}