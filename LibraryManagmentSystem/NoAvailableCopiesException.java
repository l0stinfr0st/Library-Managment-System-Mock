
package LibraryManagmentSystem;

public class NoAvailableCopiesException extends Exception {

    public NoAvailableCopiesException(String no_avaible_copes) {
        super(no_avaible_copes);
    }
    
}
