package LibraryManagmentSystem;

import java.util.Date;

public class Journal extends Item {
    private Date publicationDate;
    private String subject;
    
    public Journal(String name, String subject){
        super(name);
        this.subject = subject;
        publicationDate = new Date();
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public String getSubject() {
        return subject;
    }
    
    
}
