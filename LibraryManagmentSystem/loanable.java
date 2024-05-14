package LibraryManagmentSystem;

public interface loanable {
    
    void borrowMe() throws NoAvailableCopiesException;
    int returnMeBack();
    
}
