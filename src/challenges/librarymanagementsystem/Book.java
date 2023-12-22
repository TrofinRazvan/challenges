package challenges.librarymanagementsystem;

public class Book {

    String title;
    String author;
    String publisher;
    int ISBN;
    int numberOfCopies;
    int availableCopies;

    public Book(String title, String author, String publisher, int ISBN, int numberOfCopies, int availableCopies) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.numberOfCopies = numberOfCopies;
        this.availableCopies = availableCopies;
    }

    public void addCopy() {
        numberOfCopies++;
    }

    public void removeCopy() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
        }
    }

    public void displayBookInfo() {
        String output = "Title: " + title + '\n'
                + "Author: " + author + '\n'
                + "Publisher: " + publisher + '\n'
                + "ISBN: " + ISBN + '\n'
                + "Number of copies: " + numberOfCopies;
    }

    public boolean isAvailable() {
        return availableCopies > 0;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int isbn) {
        this.ISBN = ISBN;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies() {
        this.numberOfCopies = numberOfCopies;
    }
}