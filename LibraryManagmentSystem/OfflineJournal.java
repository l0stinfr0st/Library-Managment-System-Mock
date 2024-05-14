package LibraryManagmentSystem;

import java.util.Date;

public class OfflineJournal extends Journal implements loanable {

    private static Date loaningPeriod = new Date(7);
    private Date dueDate;
    private int numOfCopies;

    public OfflineJournal(String name, String subject, int numOfCopies) {
        super(name, subject);
        this.numOfCopies = numOfCopies;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    @Override
    public void borrowMe() throws NoAvailableCopiesException {
        if (this.getNumOfCopies() > 0) {
            this.dueDate.setTime(new Date().getTime() + loaningPeriod.getTime());
            this.numOfCopies--;
        } else {
            throw new NoAvailableCopiesException("No available copies");
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

}
