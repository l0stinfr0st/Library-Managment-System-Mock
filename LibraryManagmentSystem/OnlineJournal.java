package LibraryManagmentSystem;

public class OnlineJournal extends Journal implements onlineViewable, Cloneable {
    
    public OnlineJournal(String name, String subject){
        super(name, subject);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        OnlineJournal cloned = (OnlineJournal) super.clone();
        return cloned;
    }
    
    @Override
    public void onlineView() {
        try {
            this.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.toString());
        }
        System.out.println(this.toString());
        
    }
    
    
}
