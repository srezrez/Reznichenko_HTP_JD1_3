package by.rez.library;

import java.util.Scanner;


public class Library {
	Book books[] = new Book[3];
	int bookCount = 0;
	int size=0;
	public void addBook(Book book){
		if(bookCount<books.length){
		books[bookCount] = book;
		}
		else{
			Book oldBooks[] = books;
			books = new Book[books.length +1];
			for(int i=0; i<oldBooks.length; i++)
				books[i] = oldBooks[i];
			books[bookCount] = book;
		}
		bookCount++;
	}
	public void findOld(){
		int min = books[0].getYear(), index = 0;
		for(int i=1; i<books.length; i++)
			if (books[i].getYear()< min){
				min = books[i].getYear();
				index = i;
			}
		System.out.println("The oldest book is: "+ books[index].getName());
	}	
	public void sort(){
		for (int i = 0; i<books.length; i++){
	        int minI = i;
	        for (int j = i+1; j <books.length; j++){
	            if (books[j].getName().compareTo(books[minI].getName()) > 0)
	                minI = j;
	        }
	        String value = books[minI].getName();
	        int value1 = books[minI].getYear();
	        books[minI].setName(books[i].getName());
	        books[minI].setYear(books[i].getYear());
	        books[i].setName(value);
	        books[i].setYear(value1);
	    }
	}
}
