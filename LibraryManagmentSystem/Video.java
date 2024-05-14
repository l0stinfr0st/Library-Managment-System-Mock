package LibraryManagmentSystem;

public class Video extends MultiMedia implements onlineViewable, Cloneable {
    private String subtitle;
    private String director;
    
    public Video(String name, int numOfCopies, int year, String subtitle, String director){
        super(name, year);
        this.subtitle = subtitle;
        this.director = director;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getDirector() {
        return director;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public String toString() {
        return "Subtitle: " +  this.subtitle + " | Director: " + this.director + " " + super.toString();
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        Video cloned = (Video) super.clone();
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
