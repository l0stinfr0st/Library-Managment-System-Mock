package LibraryManagmentSystem;

import java.util.Date;

public class MultiMedia extends Item implements loanable {

    private static Date loaningPeriod = new Date(3);
    private Date dueDate;
    private int numOfCopies;
    private int year;

    public MultiMedia(String name, int year) {
        super(name);
        this.year = year;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void borrowMe() throws NoAvailableCopiesException {
        if (this.getNumOfCopies() > 0) {
            this.dueDate.setTime(new Date().getTime() + loaningPeriod.getTime());
            this.numOfCopies--;
        } else {
            throw new NoAvailableCopiesException("No Available Copies");
        }
    }

    @Override
    public int returnMeBack() {
        this.numOfCopies++;
        if (new Date().getTime() > dueDate.getTime()) {
            return 5;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Number of copies: " + this.numOfCopies + " | year: " + this.year;
    }

}
