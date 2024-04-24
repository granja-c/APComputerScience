package LibraryManagementLab;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Library implements LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;
    private ArrayList<Transaction> transactions;

    // TODO: Implement the constructor
    public Library() {
        books = new ArrayList<Book>();
        patrons = new ArrayList<Patron>();
        transactions = new ArrayList<Transaction>();
    }
    // Implement interface methods
    @Override
    public void addBook(Book book) { books.add(book); } // SORT
    @Override
    public void removeBook(String isbn) { /* Implementation */ }
    @Override
    public void addPatron(Patron p) { patrons.add(p); }
    @Override
    public void removePatron(String id) { return; }
    @Override
    public void createTransaction(String is, String id, String co) {
        Transaction t = new Transaction(is, id, co);
        // ? add?
    }
    @Override
    public void updateTransaction(String is, String id, String co) {
        // que
    }

    @Override
    public void viewMostRecentTransaction(String isbn) {
        // Hint: Use a backward loop to find the most recent transaction
        // If no transaction is found, print "No transactions found for ISBN: <isbn>"
    }

    // find book, return if the book is checked in/out
    @Override
    public boolean checkoutBook(String is, String id) {
        return false;
    }
    @Override
    public boolean checkinBook(String is, String id) {
        return false;
    }
    // TODO: Complete the implementation of LibrarySystem methods
    // TODO: Implement searchBookByTitle and searchBookByAuthor using binary search

//    @Override
//    public Book findClosestBook(String title) {
//        // TODO: Search for the closest book title using .toLowerCase() and .contains(); return the closest book or null
//    }

//    @Override
//    public Book searchBookByTitle(String title) {
//        // TODO: Binary search for book; if not found, return the closest book
//    }

//    @Override
//    public Book searchBookByAuthor(String a) {
//
//    }
    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.


    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}