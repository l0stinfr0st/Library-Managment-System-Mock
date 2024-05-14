package LibraryManagmentSystem;

public class Music extends MultiMedia implements onlineViewable, Cloneable{
    private String singer;
    
    public Music(String name, String singer, int year){
        super(name, year);
        this.singer = singer;
        
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public String toString() {
        return "Singer: " + this.singer + " " + super.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Music cloned = (Music) super.clone();
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
