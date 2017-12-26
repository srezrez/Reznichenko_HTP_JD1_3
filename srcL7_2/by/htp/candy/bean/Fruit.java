package by.htp.candy.bean;

public class Fruit extends Candy{
	private String fillingFruit;
	private boolean jelly;
	public Fruit(String name, int shugar, double weight, double cost,
			String filling, boolean jelly) {
		super(name, shugar, weight, cost);
		this.fillingFruit = filling;
		this.jelly = jelly;
	}
	public String getFilling() {
		return fillingFruit;
	}
	public void setFilling(String filling) {
		this.fillingFruit = filling;
	}
	public boolean isJelly() {
		return jelly;
	}
	public void setJelly(boolean jelly) {
		this.jelly = jelly;
	}
	

}
