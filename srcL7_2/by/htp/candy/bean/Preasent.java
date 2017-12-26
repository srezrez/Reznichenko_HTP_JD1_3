package by.htp.candy.bean;

public class Preasent {
	Fruit fruit[];
	Chocolate chocolate[];
	Lollipop lollipop[];
	public Preasent(){
		
	}
	public Preasent(Fruit[] fruit, Chocolate[] chocolate, Lollipop[] lollipop) {
		super();
		this.fruit = fruit;
		this.chocolate = chocolate;
		this.lollipop = lollipop;
	}
	public void init(int size1, int size2, int size3){
		fruit = new Fruit[size1];
		chocolate = new Chocolate[size2];
		lollipop = new Lollipop[size3];
	}
	public void addFruit(int i, String name, int shugar, double weight, double cost,
			String filling, boolean jelly){
		fruit[i] = new Fruit(name, shugar, weight, cost,
				filling, jelly);
	}
	public void addChocolate(int i, String name, int shugar, double weight, double cost,
			String color, String shape, boolean filling){
		chocolate[i] = new Chocolate(name, shugar, weight, cost,
				color, shape, filling);
	}
	public void addLollipop(int i, String name, int shugar, double weight, double cost,
			boolean wand, String shape, String taste){
		lollipop[i] = new Lollipop(name, shugar, weight, cost,
				wand, shape, taste);
	}
	public Fruit[] getFruit() {
		return fruit;
	}
	public void setFruit(Fruit[] fruit) {
		this.fruit = fruit;
	}
	public Chocolate[] getChocolate() {
		return chocolate;
	}
	public void setChocolate(Chocolate[] chocolate) {
		this.chocolate = chocolate;
	}
	public Lollipop[] getLollipop() {
		return lollipop;
	}
	public void setLollipop(Lollipop[] lollipop) {
		this.lollipop = lollipop;
	}
	
	public double weight(){
		double weight = 0;
		for(int i=0; i<fruit.length && fruit[i]!=null; i++)
			weight+= fruit[i].getWeight();
		for(int i = 0; i<chocolate.length && chocolate[i]!= null; i++)
			weight+= chocolate[i].getWeight();
		for(int i= 0; i<lollipop.length && lollipop[i]!=null; i++)
			weight+=lollipop[i].getWeight();
		return weight;
	}
	public void sortFruitBySugar(){
		int min = 0;
		for (int i = 0; i<fruit.length; i++){
	        min = i;
	        for (int j = i+1; j <fruit.length; j++){
	            if (fruit[j].getShugar() < fruit[min].getShugar())
	                min = j;
	        }
	        Fruit value = fruit[min];
	        fruit[min] = fruit[i];
	        fruit[i] = value;
	    }
	}
	public void sortLollipopBySugar(){
		int min = 0;
		for (int i = 0; i<lollipop.length; i++){
	        min = i;
	        for (int j = i+1; j <lollipop.length; j++){
	            if (lollipop[j].getShugar() < lollipop[min].getShugar())
	                min = j;
	        }
	        Lollipop value = lollipop[min];
	        lollipop[min] = lollipop[i];
	        lollipop[i] = value;
	    }
	}
	public void sortChocolateBySugar(){
		int min = 0;
		for (int i = 0; i<chocolate.length; i++){
	        min = i;
	        for (int j = i+1; j <chocolate.length; j++){
	            if (chocolate[j].getShugar() < chocolate[min].getShugar())
	                min = j;
	        }
	        Chocolate value = chocolate[min];
	        chocolate[min] = chocolate[i];
	        chocolate[i] = value;
	    }
	}
	public void find(int beg, int end){
		for(int i=0; i<fruit.length && fruit[i]!=null; i++)
			if(fruit[i].getShugar() <=end && fruit[i].getShugar()>= beg)
				System.out.println(fruit[i].getName());
		for(int i = 0; i<chocolate.length && chocolate[i]!= null; i++)
			if(chocolate[i].getShugar() <=end && chocolate[i].getShugar()>= beg)
				System.out.println(chocolate[i].getName());
		for(int i= 0; i<lollipop.length && lollipop[i]!=null; i++)
			if(lollipop[i].getShugar() <=end && lollipop[i].getShugar()>= beg)
				System.out.println(lollipop[i].getName());
	}

}
