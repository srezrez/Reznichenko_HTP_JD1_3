package by.Rez.lsn4;
import java.util.Scanner;

public class Main {
	public double add(){
		int value = 0+ (int)(Math.random()*100);
		return value;
	}
	
	public double findMax(double x[]){
		double max= x[0];
		for (int i=1; i<100; i++){
			if (x[i]>max)
				max=x[i];
		}
		return max;
	}
	
	public double division(double value, double max){
		value/=max;
		return value;
	}
	
	public static void main(String[] args) {
		double x[] = new double[100];
		int i=0;
		double max=0;
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		for(i=0; i<100; i++){
			x[i]= main.add();
		}
		max = main.findMax(x);
		System.out.println(max);
		System.out.println(' ');
		for (i=0; i<100; i++){
			System.out.println(main.division(x[i], max));
		}
	}
}
