package by.htp.flower.bean;

public class Bud {
	private Leaf leaves[];
	private String color;
	private int size;
	public Bud(int size, String color){
		this.size = size;
		this.color = color;
	}
	public Leaf[] getLeaves() {
		return leaves;
	}
	public void setLeaves(Leaf[] leaves) {
		this.leaves = leaves;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
