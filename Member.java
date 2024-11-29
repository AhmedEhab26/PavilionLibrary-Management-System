import java.util.*;

public class Member {
    private int memberId;
    private String name;
    private String contactInfo;
    private List<Book> booksBorrowed;

    public Member(int memberId, String name, String contactInfo) {
        this.memberId = memberId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.booksBorrowed = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            booksBorrowed.add(book);            // Add  book to borrowed list
            book.setAvailabilityStatus(false);  //   book  unavailable
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, the book is currently unavailable.");
        }
    }

            // return a borrowed book//
    public void returnBook(Book book) {
        for (Book borrowedBook : booksBorrowed) {
            if (borrowedBook.equals(book)) { // Check  book matches
                booksBorrowed.remove(book);                   // Remove book borrowed list
                book.setAvailabilityStatus(true);   //  book available
                System.out.println(name + " returned the book: " + book.getTitle());
                return;
            }
        }
        System.out.println("This book was not borrowed by you.");
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setBooksBorrowed(List<Book> booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public List<Book> getBooksBorrowed() {
        return booksBorrowed;
    }

}
