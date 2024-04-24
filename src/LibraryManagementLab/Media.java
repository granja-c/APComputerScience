package LibraryManagementLab;

public abstract class Media {
    private String title;
    private String isbn;
    private boolean isCheckedOut;

    // TODO: Implement constructor (title, isbn)
    public Media(String t, String i) {
        title = t;
        isbn = i;
        isCheckedOut = false;
    }

    // TODO: Implement getter methods
    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
}
