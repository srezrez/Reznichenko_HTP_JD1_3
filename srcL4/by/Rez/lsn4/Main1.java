package by.Rez.lsn4;
import java.util.Scanner;

public class Main1 {
	public double add(){
		int value = -50+ (int)(Math.random()*100);
		return value;
	}
	
	public int add1(){
		int value = 0+ (int)(Math.random()*199);
		return value;
	}
	
	public double sqr(double arr[], int size){
		double sum = 0;
		for (int i = 0; i<size; i++)
			sum+= arr[i]*arr[i];
		return sum;
	}
	
	public void print1(double arr[]){
		for(int i=0; i<20; i++){
		System.out.print(arr[i]+ "  ");
	}
	}
	
	public void print2(double arr[][]){
		for (int i=0; i<5; i++){
			for (int j=0; j<5; j++)
				System.out.print(arr[i][j]+"  ");
			System.out.println(" ");
		}
	}
	
	public void print3(int arr[][]){
		for (int i=0; i<5; i++){
			for (int j=0; j<5; j++)
				System.out.print(arr[i][j]+"  ");
			System.out.println(" ");
		}
	}

	public void findmax(double arr[][]){
		for (int j=0; j<5; j++){
			double max = arr[0][j];
			for (int i=1; i<5; i++){
				if (arr[i][j] > max)
					max = arr[i][j];
			}
			System.out.printf("Max item of %d is: %f  %n", j, max);
		}
	}
	
	public int meet(double arr[][], double X){
		int counter=0;
		for (int i=0; i<5; i++)
			for (int j=0; j<5; j++)
				if (arr[i][j]==X)
					counter++;
		return counter;
	}
	
	public int find(int arr[][], int size){
		int frst=0, lst=0, counter=0;
		for(int i=0; i< size; i++)
			for(int j=0; j<size; j++)
				if (arr[i][j]> 9 && arr[i][j]<100){
					frst = arr[i][j]/10;
					lst = arr[i][j]%10;
					if ((frst+lst)%2 == 0)
						counter++;
				}
		return counter;
	}
	
	public static void main(String[] args) {
		double arra[] = new double[20];
		int i=0, sizeb=0, j=0;
		double X=0;
		Main1 main = new Main1();
		Scanner in = new Scanner(System.in);
//		for(i=0; i<20; i++){
//			arra[i]= main.add();
//		}
//		System.out.println("Array a: ");
//        main.print1(arra);
//		System.out.println(' ');
//		for (i=2;i<20; i+=2)
//			if(arra[i]>0)
//				sizeb++;
//		double arrb[] = new double[sizeb];
//		for (i=2; i<20; i+=2)
//			if(arra[i]>0){
//				arrb[j] = arra[i];
//				j++;
//			}
//		System.out.println("Array b: ");
//		main.print1(arrb);
//		System.out.println(' ');
//		System.out.println("Amout of sqr items of array b is: " + main.sqr(arrb, sizeb));
		
//		double arr[][] = new double[5][5];
//		for (i=0; i<5; i++)
//			for (j=0; j<5; j++)
//				arr[i][j]= main.add();
//		System.out.println("Array: ");
//		main.print2(arr);
//		int st1, st2;  // change of strings 
//		System.out.println("Input numbers of two strings: ");
//		st1 = in.nextInt();
//		st2 = in.nextInt();
//		for(j=0; j<5; j++){
//			double value = arr[st1][j];
//			arr[st1][j] = arr[st2][j];
//			arr[st2][j] = value;
//		}
//		System.out.println("Array after change: ");
//		main.print2(arr);
		
//		main.findmax(arr);
		
//		System.out.println("Input X: ");
//		X = in.nextDouble();
//		System.out.println("The amount of meeting X in array is: "+ main.meet(arr, X));
		System.out.println("Input the size of array: ");
		int size;
		size = in.nextInt();
		int arr3[][] = new int[size][size];
		for (i=0; i<size; i++)
			for (j=0; j<size; j++)
				arr3[i][j] = main.add1();
		main.print3(arr3);
		System.out.println("The result of find is: "+ main.find(arr3, size));
		
	} 

}
