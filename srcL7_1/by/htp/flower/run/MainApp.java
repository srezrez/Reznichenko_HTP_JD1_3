package by.htp.flower.run;

import java.util.Scanner;
import by.htp.flower.bean.*;

public class MainApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Let's create our boquet! How many flowers do you want? ");
		int number = in.nextInt();
		Boquet boq = new Boquet();
		System.out.println("How many accessory do you want to add? ");
		int number1 = in.nextInt();
		boq.init(number, number1);
		for (int i=0; i<number; i++){
			System.out.println("Input name of flower: ");
			String title = in.next();
			System.out.println("Input bud color: ");
			String color = in.next();
			System.out.println("Input bud size: ");
			int budSize = in.nextInt();
			System.out.println("Input height of stem: ");
			int height = in.nextInt();
			System.out.println("Input width of stem: ");
			int width = in.nextInt();
			System.out.println("Input cost of 1 flower: ");
			int cost = in.nextInt();
			System.out.println("Input day and month of commertion: ");
			int day = in.nextInt();
			int month = in.nextInt();
			boq.addFlowers(i, title, cost, day, month, budSize, color, height, width);
			System.out.println("========================================");
		}
		for (int i=0; i<number; i++){
			printFlower(boq.getFlowers(i));
		}
		System.out.println("Cost of our boquet is: "+ boq.costOfBoquet());
		System.out.println("Input range of stem height: ");
		int beg = in.nextInt();
		int end = in.nextInt();
		System.out.println("Flower(s) with stem of your range is: ");
		boq.find(beg, end);
		System.out.println("Sort your boquet ");
		boq.sortFresh();
		for (int i=0; i<number; i++){
			printFlower(boq.getFlowers(i));
		}

	}
private static void printFlower(Flower flower){
		
		System.out.println("Flower: " + flower.getTitle());
		System.out.println("Cost: "+ flower.getCost());
		System.out.println("Freshness: "+ flower.getDay()+"."+flower.getMonth());
		System.out.println("stem height, width: " + flower.getStem().getHeight() + ", " + flower.getStem().getWidth());
		System.out.println("bud size, color: " + flower.getBud().getSize() + ", " + flower.getBud().getColor());
		
		System.out.println("======================================");
	}
	
} // extends + one more;
