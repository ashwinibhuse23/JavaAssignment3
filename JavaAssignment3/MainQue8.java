package assignment;

public class MainQue8 {
	public static void main(String[] args) {
		
		LibraryQue8 library = new LibraryQue8();

	    BookQue8 book1 = new BookQue8("Adventures of Tom Sawyer", "Mark Twain");
	    BookQue8 book2 = new BookQue8("Ben Hur", "Lewis Wallace");
	    BookQue8 book3 = new BookQue8("Time Machine", "H.G. Wells");
	    BookQue8 book4 = new BookQue8("Anna Karenina", "Leo Tolstoy");

	    library.addBook(book1);
	    library.addBook(book2);
	    library.addBook(book3);
	    library.addBook(book4);

	    System.out.println("Books in the library:");
	    for (BookQue8 book: library.getBooks()) {
	      System.out.println(book.getTitle() + " by " + book.getAuthor());
	    }
	    
	    library.removeBook(book2);
	    System.out.println("\nBooks in the library after removing " + book2.getTitle() + ":");
	    for (BookQue8 book: library.getBooks()) {
	      System.out.println(book.getTitle() + " by " + book.getAuthor());
	    }
	}
}