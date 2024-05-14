package LibraryManagmentSystem;

import java.util.Date;

public class TextBook extends Book implements loanable{
    private static Date loaningPeriod = new Date(30);
    private Date dueDate = new Date();
    
    public TextBook(String name,int ISBN,String author){
        super(name, author, ISBN);
    }

    @Override
    public void borrowMe() throws NoAvailableCopiesException {
        if(this.getNumOfCopies() > 0){
            this.dueDate.setTime(new Date().getTime() + loaningPeriod.getTime());
            this.setNumOfCopies(this.getNumOfCopies()-1);
        }else{
            throw new NoAvailableCopiesException("No available copies");
        }
    }

    @Override
    public int returnMeBack() {
        this.setNumOfCopies(this.getNumOfCopies()+1);
        if(new Date().getTime()>dueDate.getTime()){
            return 5;
        }
        return 0;
    }
}
