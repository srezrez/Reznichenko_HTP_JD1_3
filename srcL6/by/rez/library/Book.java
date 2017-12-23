package by.rez.library;

public class Book {
	private int year;
	private String name;
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
	
	public int getYear(){
		return year;
	}
	public String getName(){
		return name;
	}
	
}
