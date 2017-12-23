package by.rez.library;

import java.util.Scanner;


public class Library {
	Book books[] = new Book[3];
	int bookCount = 0;
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
	public void sortName(){
		for (int i = 0; i<books.length; i++){
	        int minI = i;
	        for (int j = i+1; j <books.length; j++){
	            if (books[j].getName().compareTo(books[minI].getName()) > 0)
	                minI = j;
	        }
	        String value = books[minI].getName();
	        String value2 = books[minI].getAuthor();
	        int value1 = books[minI].getYear();
	        books[minI].setName(books[i].getName());
	        books[minI].setYear(books[i].getYear());
	        books[minI].setAuthor(books[i].getAuthor());
	        books[i].setName(value);
	        books[i].setYear(value1);
	        books[i].setAuthor(value2);
	    }
	}
	public void searchPeriod(int beg, int end){
		for(int i= 0; i<books.length; i++)
			if(books[i]!=null){
				if (books[i].getYear() >=beg && books[i].getYear() <=end)
					System.out.println(books[i].getName());
			}
		
	}
	public void searchAuthor(String s){
		for(int i= 0; i<books.length; i++)
			if(books[i]!= null)
				if(books[i].getAuthor().compareTo(s) == 0)
					System.out.println(books[i].getName());
	}
	public void searchName(String s1){
		for(int i= 0; i<books.length; i++)
			if(books[i]!= null)
				if(books[i].getName().compareTo(s1) == 0)
					System.out.println(books[i].getName());
	}
	public void searchNA (String s, String s1){
		for(int i= 0; i<books.length; i++)
			if(books[i]!= null)
				if(books[i].getAuthor().compareTo(s) == 0 && books[i].getName().compareTo(s1) == 0)
					System.out.println(books[i].getName());
	}
	public void delete (String s, String s1){
		for(int i= 0; i<books.length; i++)
			if(books[i]!= null)
				if(books[i].getAuthor().compareTo(s) == 0 && books[i].getName().compareTo(s1) == 0){
					for(int j=i; j<books.length && books[j+1]!=null; j++){
						books[j] = books[j+1];
					}
					bookCount--;
				}
	}
	public void searchEqual (){
		int counter=1, year1=0;
		String name1, author1;
		for(int i= 0; i<books.length; i++)
			if(books[i]!=null){
				year1 = books[i].getYear();
				name1= books[i].getName();
				author1 = books[i].getAuthor();
				for (int j=0; j<books.length && books[j]!=null; j++)
					if(books[i].getAuthor().compareTo(author1) == 0 && books[i].getName().compareTo(name1) == 0 && books[i].getYear() == year1)
						counter++;
				if (counter>1)
					System.out.println(books[i].getName() + books[i].getAuthor() + books[i].getYear() + counter);
				counter=1;
			}
	}
	
}
