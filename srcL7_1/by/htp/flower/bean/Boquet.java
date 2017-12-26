package by.htp.flower.bean;

public class Boquet {
	private Flower flowers[];
	private Accessory acc[];
	public Flower[] getFlowers() {
		return flowers;
	}
	public void init(int number, int number1){
		flowers = new Flower[number];
		acc = new Accessory[number1];
	}

	public Flower getFlowers(int i) {
		return flowers[i];
	}

	public void setFlowers(Flower[] flowers) {
		this.flowers = flowers;
	}
	public void addFlowers(int i, String title, double cost,int day, int month, int budSize, String color, int height, int width){
			flowers[i] = new Flower(title, cost, day, month, budSize, color, height, width);
	}
	public double costOfBoquet(){
		double cost = 0;
		for(int i=0; i<flowers.length && flowers[i]!=null; i++)
			cost+=flowers[i].getCost();
		for(int i=0; i<acc.length && acc[i]!=null; i++){
			cost+=acc[i].getCost();
		}
		return cost;	
	}
	public void find(int beg, int end){
		for(int i=0; i<flowers.length; i++)
			if(flowers[i].getStem().getHeight()>= beg && flowers[i].getStem().getHeight()<= end)
				System.out.println(flowers[i].getTitle());
	}
	public void sortFresh(){
		int min = 0;
		for (int i = 0; i<flowers.length; i++){
	        min = i;
	        for (int j = i+1; j <flowers.length; j++){
	            if (flowers[j].getMonth() < flowers[min].getMonth())
	                min = j;
	            else if(flowers[j].getDay()< flowers[min].getDay())
	            	min = j;
	        }
	        Flower value = flowers[min];
	        flowers[min] = flowers[i];
	        flowers[i] = value;
	    }
	}
}
