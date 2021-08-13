public class Book {
    private final int bookID;
    private String bookName;
    private boolean lent;

    public Book(int bookID, String bookName, boolean lent) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.lent = lent;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setLent(boolean lent) {
        this.lent = lent;
    }

    public int getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public boolean isLent() {
        return lent;
    }
}
