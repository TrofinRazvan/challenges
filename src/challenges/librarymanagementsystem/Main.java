package challenges.librarymanagementsystem;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("A to Z", "Mao Zedong", "Neon", 978653287, 4, 2);
        Book book2 = new Book("How it is made", "Discovery", "Channel", 978545422, 5, 3);
        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Hagi", "Florilor", "Not included");
        Member member2 = new Member("Napoleon", "Paris", "France");
        library.addMember(member1);
        library.addMember(member2);

        System.out.println("All books:");
        library.displayAllBooks();

        System.out.println("\nAll members:");
        library.displayAllMembers();
        System.out.println();

        library.removeBook(book1);
        library.displayAllBooks();

        System.out.println("\nSearch result for books:");
        List<Book> searchResultBooks = library.searchBooks("How it is made");
        for (Book book : searchResultBooks) {
            System.out.println(book.title + " by " + book.author + ", ISBN " + book.ISBN);
        }
    }
}