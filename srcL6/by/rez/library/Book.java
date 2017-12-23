package by.rez.library;

public class Book {
	private int year;
	private String name;
	private String author;
	public Book(){}
	public Book(int year, String s){
		this.year = year;
		name = s;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public int getYear(){
		return year;
	}
	public String getName(){
		return name;
	}
	public String getAuthor(){
		return author;
	}
}
