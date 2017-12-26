package by.htp.candy.bean;

public class Candy {
	private String name;
	private int sugar;
	private double weight;
	private double cost;
	public Candy(String name, int sugar, double weight, double cost) {
		super();
		this.name = name;
		this.sugar = sugar;
		this.weight = weight;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getShugar() {
		return sugar;
	}
	public void setShugar(int shugar) {
		this.sugar = shugar;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	

}
