public class Book {

    // properties, fields, global variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;
    
    // constructor
    public Book(String bookTtitle, int bookPageCount, int bookISBN) {
        this.title = bookTtitle;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        isCheckedOut = false;
    }

    // getters --> instance methods
    public String getTitle(){
        return this.title;

    }
    
    public int getPageCount() {
        return this.pageCount;
    }
    
    public int getISBN() {
        return this.ISBN;
    }
    
    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }
    
    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

    // setters

    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut){
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    private void setDayCheckedOut(int day){
        this.dayCheckedOut = day;
    }

}
