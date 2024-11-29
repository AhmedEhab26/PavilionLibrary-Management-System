import java.time.LocalDate;

public class Loan {
    private int loanId;
    private int bookId;
    private int memberId;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Loan(int loanId, int bookId, int memberId, LocalDate issueDate, LocalDate returnDate) {
        this.loanId = loanId;
        this.bookId = bookId;
        this.memberId = memberId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public int getLoanId() {
        return loanId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

            // Check  loan  overdue//
    public boolean isOverdue(LocalDate currentDate) {
        return currentDate.isAfter(returnDate);
    }

           // Borrow book process//
    public static Loan borrowBook(Book book, int memberId, int loanId, LocalDate issueDate, int loanDurationDays) {
        if (!book.isAvailable()) {
            System.out.println("Book is not available for borrowing.");
            return null; // Book unavailable
        }
        book.setAvailabilityStatus(false);
        LocalDate returnDate = issueDate.plusDays(loanDurationDays); // Calculate return date
        System.out.println("Book borrowed successfully: " + book.getTitle());
        return new Loan(loanId, book.getBookId(), memberId, issueDate, returnDate);
    }

          // Return book process//
    public static void returnBook(Loan loan, Book book) {
        if (loan == null || book == null) {
            System.out.println("Invalid loan or book details.");
            return;
        }
        book.setAvailabilityStatus(true);
        loan.setReturnDate(LocalDate.now()); //  return date to the current date
        System.out.println("Book returned successfully: " + book.getTitle());
    }

    @Override
    public String toString() {
        return "Loan ID: " + loanId + ", Book ID: " + bookId + ", Member ID: " + memberId +
                ", Issue Date: " + issueDate + ", Return Date: " + returnDate;
    }
}
