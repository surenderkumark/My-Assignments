package week2.day1;

public class Library {
		
	public String addBook(String bookTitle) {
        System.out.println("Book added successfully");
        return bookTitle;
    }

    // Method to issue a book
    public void issueBook() {
        System.out.println("Book issued successfully");
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of Library class
        Library libraryClass = new Library();

        // Call issueBook method
        libraryClass.addBook("bookTitle");
        libraryClass.issueBook();
    }
}




