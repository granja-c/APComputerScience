package LibraryManagementLab;

public class Transaction {
    private String isbn;
    private String patronId;
    private String checkoutDate; // Simple date format
    private String returnDate; // Optional, can be null if not returned yet

    // TODO: Implement constructor (isbn, patronId, checkoutDate); set returnDate to null by default

    public Transaction(String is, String id, String cdate) {
        isbn = is;
        patronId = id;
        checkoutDate = cdate;
        returnDate = null;
    }
    // TODO: Implement getters and setters


    public String getIsbn() {
        return isbn;
    }

    public String getPatronId() {
        return patronId;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "isbn='" + isbn + '\'' +
                ", patronId='" + patronId + '\'' +
                ", checkoutDate='" + checkoutDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}