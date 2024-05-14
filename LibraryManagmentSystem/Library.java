package LibraryManagmentSystem;

import java.util.ArrayList;

public class Library {

    private ArrayList itemList = new ArrayList<Item>();

    public Library() {
    }

    public void addItem(Item i) {
        if (i instanceof Book && itemList.contains(i)) {
            ((Book) i).setNumOfCopies(((Book) i).getNumOfCopies() + 1);
        } else {
            itemList.add(i);
        }
    }

    public void wantToBorrowThis(Item e) throws SorryICannotDoItException {
        for (int i = 0; i < itemList.size(); i++) {
            if (e.equals(itemList.get(i))) {
                if (e instanceof loanable) {
                    try {
                        ((loanable) e).borrowMe();
                    } catch (NoAvailableCopiesException ex) {
                        System.out.println(ex.toString());
                    }
                } else {
                    throw new SorryICannotDoItException("Item is not loanable");
                }
            }
        }
    }

    public void wantToReturnThis(Item e) throws SorryICannotDoItException {
        for (int i = 0; i < itemList.size(); i++) {
            if (e.equals(itemList.get(i))) {
                if (e instanceof loanable) {
                    ((loanable) e).returnMeBack();
                    if(((loanable)e).returnMeBack()>0){
                        System.out.println(((loanable)e).returnMeBack());
                    }
                } else {
                    throw new SorryICannotDoItException("Item is not returnable");
                }
            }
        }
    }

    public void wantToOnlineView(Item e) throws SorryICannotDoItException {
        for (int i = 0; i < itemList.size(); i++) {
            if (e.equals(itemList.get(i))) {
                if (e instanceof onlineViewable) {
                    ((onlineViewable) e).onlineView();
                }else{
                    throw new SorryICannotDoItException("Item is not online viewable");
                }
            }
        }
    }
}
