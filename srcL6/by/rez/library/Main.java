package by.rez.library;

public class Main {
	public static void main(String[] args){
		
	  Library library = new Library();
	  Book book = new Book();
	  library.addBook(book);
	  library.findOld();
	  library.sort();
	
	}

}
