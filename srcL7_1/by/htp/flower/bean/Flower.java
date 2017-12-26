package by.htp.flower.bean;

public class Flower {
	private String title;
	private Bud bud;
	private Stem stem;
	private double cost;
	int day, month;
	public Flower(String title, double cost,int day, int month, int budSize, String color, int height, int width){
		this.title = title;
		this.cost = cost;
		this.day = day;
		this.month = month;
		bud = new Bud(budSize, color);
		stem = new Stem(height, width);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Bud getBud() {
		return bud;
	}
	public void setBud(Bud bud) {
		this.bud = bud;
	}
	public Stem getStem() {
		return stem;
	}
	public void setStem(Stem stem) {
		this.stem = stem;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setDay(int day){
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	
	
	

}
