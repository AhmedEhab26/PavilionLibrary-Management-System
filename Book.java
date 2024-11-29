public class Book {
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private boolean availabilityStatus;

    public Book(int bookId, String title, String author, String genre, boolean availabilityStatus) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }


    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public void setTitle(String title) {
    }

    public void setAuthor(String author) {
    }

    public void setGenre(String genre) {
    }

    public boolean isAvailable() {
        return availabilityStatus;
    }

    public void displayBookInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + (availabilityStatus ? "Yes" : "No"));
        System.out.println("----------------------");
    }
}
