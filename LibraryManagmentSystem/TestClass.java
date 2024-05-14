package LibraryManagmentSystem;

public class TestClass {

    private static Library lib;

    public static void main(String[] args) {
        lib = new Library();
        Item it = new TextBook("Alican", 123, "book1");
        Item it2 = new Music("Hey Jude", "Beatles", 1968);
        lib.addItem(it);
        lib.addItem(it);//yes added twice!
        lib.addItem(it2);
        try {
            lib.wantToBorrowThis(it);
        } catch (SorryICannotDoItException ex) {
            System.out.println(ex.toString());
        }
        try {
            lib.wantToBorrowThis(it);
        } catch (SorryICannotDoItException ex) {
            System.out.println(ex.toString());
        }
        try {
            lib.wantToBorrowThis(it);
        } catch (SorryICannotDoItException ex) {
            System.out.println(ex.toString());
        }

        try {
            lib.wantToOnlineView(it2);
        } catch (SorryICannotDoItException ex) {
            System.out.println(ex.toString());
        }
    }
}
