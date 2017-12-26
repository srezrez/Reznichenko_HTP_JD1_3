package by.htp.candy.bean;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Preasent present = new Preasent();
		Scanner in = new Scanner(System.in);
		System.out.println("How many Fruit candies do you want? ");
		int size1 = in.nextInt();
		System.out.println("How many Chocolate candies do you want? ");
		int size2 = in.nextInt();
		System.out.println("How many Lollipop candies do you want? ");
		int size3 = in.nextInt();
		present.init(size1, size2, size3);
		boolean jelly = true, filling1  = true, wand = true;
		for (int i=0; i<size1; i++){
			System.out.println("Input name of candy: ");
			String name = in.next();
			System.out.println("Input level of sugar: ");
			int sugar = in.nextInt();
			System.out.println("Input weight: ");
			double weight = in.nextDouble();
			System.out.println("Input cost: ");
			double cost = in.nextDouble();
			System.out.println("Input filling: ");
			String filling = in.next();
			System.out.println("Is your candy with jelly? 1-yes; 0- no: ");
			int choice = in.nextInt();
			switch(choice){
			case 1: jelly = true;
			break;
			case 2: jelly = false;
			break;
			}
			present.addFruit(i, name, sugar, weight, cost, filling, jelly);
			System.out.println("========================================");
		}
		for (int i=0; i<size2; i++){
			System.out.println("Input name of candy: ");
			String name = in.next();
			System.out.println("Input level of sugar: ");
			int sugar = in.nextInt();
			System.out.println("Input weight: ");
			double weight = in.nextDouble();
			System.out.println("Input cost: ");
			double cost = in.nextDouble();
			System.out.println("Input color of chocolate: ");
			String color = in.next();
			System.out.println("Input shape of your candy: ");
			String shape = in.next();
			System.out.println("Is your candy with fiiling? 1-yes; 0- no: ");
			int choice = in.nextInt();
			switch(choice){
			case 1: filling1 = true;
			break;
			case 2: filling1 = false;
			break;
			}
			present.addChocolate(i, name, sugar, weight, cost, color, shape, filling1);
			System.out.println("========================================");
		}
		for (int i=0; i<size3; i++){
			System.out.println("Input name of candy: ");
			String name = in.next();
			System.out.println("Input level of sugar: ");
			int sugar = in.nextInt();
			System.out.println("Input weight: ");
			double weight = in.nextDouble();
			System.out.println("Input cost: ");
			double cost = in.nextDouble();
			System.out.println("Input taste of lollipop: ");
			String taste = in.next();
			System.out.println("Input shape of your candy: ");
			String shape = in.next();
			System.out.println("Is your candy with wand? 1-yes; 0- no: ");
			int choice = in.nextInt();
			switch(choice){
			case 1: wand = true;
			break;
			case 2: wand = false;
			break;
			}
			present.addLollipop(i, name, sugar, weight, cost, wand, shape, taste);
			System.out.println("========================================");
		}
		System.out.println("Weight of your present is: "+ present.weight());
		System.out.println("Input the range og sugar: ");
		int beg = in.nextInt();
		int end = in.nextInt();
		present.find(beg, end);
		present.sortFruitBySugar();
		present.sortLollipopBySugar();
		present.sortChocolateBySugar();
	}

}
