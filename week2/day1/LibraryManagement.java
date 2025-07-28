package week2.day1;

public class LibraryManagement {
	 // Main method
    public static void main(String[] args) {
        // Create an object of Library class
        Library libraryClass = new Library();

        // Call add book and issueBook method from Library class
        libraryClass.addBook("bookTitle");
        libraryClass.issueBook();

}
}