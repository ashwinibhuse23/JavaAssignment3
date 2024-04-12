package assignment;

import java.util.ArrayList;

public class LibraryQue8 {
	
	private ArrayList < BookQue8 > books;

	  public LibraryQue8() {
	    books = new ArrayList < BookQue8 > ();
	  }

	  public void addBook(BookQue8 book) {
	    books.add(book);
	  }

	  public void removeBook(BookQue8 book) {
	    books.remove(book);
	  }

	  public ArrayList < BookQue8 > getBooks() {
	    return books;
	  }
	}