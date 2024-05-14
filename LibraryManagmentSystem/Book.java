package LibraryManagmentSystem;

public class Book extends Item {
    private String author;
    private int ISBN;
    private int numOfCopies;
    
    public Book(String name, String author, int ISBN){
        super(name);
        this.author = author;
        this.ISBN = ISBN;        
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }
    
    
    
        
}
