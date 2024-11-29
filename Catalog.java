import java.util.*;
public class Catalog {
    private List<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

           // add book to catalog//
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the catalog: " + book.getTitle());
    }

              //update book details in catalog//
    public void updateBook(int bookId, String title, String author, String genre, boolean availabilityStatus) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getBookId() == bookId) {
                book.setTitle(title);
                book.setAuthor(author);
                book.setGenre(genre);
                book.setAvailabilityStatus(availabilityStatus);
                System.out.println("Book updated: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found.");
    }

                // search book  ID//
    public Book searchBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public void displayCatalog() {
        if (books.isEmpty()) {
            System.out.println("No books in the catalog.");
        } else {
            for (Book book : books) {
                book.displayBookInfo();  /* Displays book details using the displayBookInfo method from the Book class*/
            }
        }
    }


    public List<Book> getBooks() {
        return books;
    }


}
