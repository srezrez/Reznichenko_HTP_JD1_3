package by.rez.library;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
	  Library library = new Library();
	  Book book = new Book();
	  library.addBook(book);
	  library.findOld();
	  library.sortName();
	  int beg=0, end=0;
	  Scanner in = new Scanner(System.in);
	  System.out.println("Input begin and end of the period: ");
	  beg = in.nextInt();
	  end = in.nextInt();
	  System.out.println("All books diring this perion are: ");
	  library.searchPeriod(beg, end);
	  System.out.println("Input author: ");
	  String s = in.nextLine();
	  library.searchAuthor(s);
	  System.out.println("Input name of book: ");
	  String s1 = in.nextLine();
	  library.searchName(s1);
	  library.delete(s, s1);
	  library.searchEqual();	
	}

}
