package Week5;
import java.util.*;

class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String author;
    private String publicationDate;

    public Book(String title, int pageCount, String author, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}

public class KitapSiralayici {
    public static void main(String[] args) {
        // İsimlerine göre sıralı set
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(new Book("Harry Potter", 400, "J.K. Rowling", "2000-06-26"));
        bookSetByName.add(new Book("Lord of the Rings", 1178, "J.R.R. Tolkien", "1954-07-29"));
        bookSetByName.add(new Book("1984", 328, "George Orwell", "1949-06-08"));
        bookSetByName.add(new Book("To Kill a Mockingbird", 281, "Harper Lee", "1960-07-11"));
        bookSetByName.add(new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", "1925-04-10"));

        System.out.println("Kitaplar isme göre sıralı:");
        for (Book book : bookSetByName) {
            System.out.println(book.getTitle());
        }

        // Sayfa sayısına göre sıralı set
        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.addAll(bookSetByName);

        System.out.println("\nKitaplar sayfa sayısına göre sıralı:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book.getTitle() + " - Sayfa Sayısı: " + book.getPageCount());
        }
    }
}


