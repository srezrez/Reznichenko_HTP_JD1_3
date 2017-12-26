package by.htp.candy.bean;

public class Chocolate extends Candy{
	private String color;
	private String shape;
	private boolean filling;
	public Chocolate(String name, int shugar, double weight, double cost,
			String color, String shape, boolean filling) {
		super(name, shugar, weight, cost);
		this.color = color;
		this.shape = shape;
		this.filling = filling;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public boolean isFilling() {
		return filling;
	}
	public void setFiiling(boolean filling) {
		this.filling = filling;
	}
	
	

}
