package by.htp.candy.bean;

public class Lollipop extends Candy{
	private boolean wand;
	private String shape;
	private String taste;
	public Lollipop(String name, int shugar, double weight, double cost,
			boolean wand, String shape, String taste) {
		super(name, shugar, weight, cost);
		this.wand = wand;
		this.shape = shape;
		this.taste = taste;
	}
	public boolean isWand() {
		return wand;
	}
	public void setWand(boolean wand) {
		this.wand = wand;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	

}
