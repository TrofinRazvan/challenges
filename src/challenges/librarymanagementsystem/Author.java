package challenges.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private String nationality;
    private int dateOfBirth;
    List<Book> books;

    public Author(String name, String nationality, int dateOfBirth) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayInfoAuthor() {
        String output = "Name: " + getName() + '\n'
                + "Nationality: " + getNationality() + '\n'
                + "Date of birth: " + getDateOfBirth();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}