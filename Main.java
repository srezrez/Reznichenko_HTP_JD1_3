package by.Rez.lsn3;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int x[] = new int[100];
		int dif=0, numE=0, numNE=0, max1=0, min1=0, max2=0, min2=0;
		for(int i=0; i<100; i++){
			x[i]= i;//(int)Math.random()*100;
		}
//		for(int i=0; i<100; i++){
//			if (x[i]%2 == 0){
//				numE++;
//				System.out.println(x[i]);
//			}
//			else{
//				numNE++;
//				dif-=x[i];
//			}
//		}
//		int pos1=0, pos2=0, i=0;
//		for(i=2; i<100; i++){
//			if (x[i]%2==0){
//				max1=x[i];
//				min1=x[i];
//				pos1=i;
//			}
//			break;
//		}
//		for(i=1; i<100; i++){
//			if (x[i]%2!=0){
//				max2=x[i];
//				min2=x[i];
//				pos2=i;
//			}
//			break;
//		}
//		for (i=pos1; i<100; i++){
//			if(x[i]%2==0){
//			if (x[i]>max1)
//				max1=x[i];
//			if (x[i]<min1)
//				min1=x[i];
//			}
//		}
//		for (i=pos2; i<100; i++){
//			if(x[i]%2!=0){
//			if (x[i]>max2)
//				max2=x[i];
//			if (x[i]<min2)
//				min2=x[i];
//			}
//		}
//		System.out.println("Max element of even numbers is: "+ max1);
//		System.out.println("Min element of even numbers is: "+ min1);
//		System.out.println("Max element of not even numbers is: "+ max2);
//		System.out.println("Min element of not even numbers is: "+ min2);
//		System.out.println("The amount of Even numbers is "+ numE);
//		System.out.println("The amount of not Even numbers is "+ numNE);
//		int max= x[0];
//		for (i=1; i<100; i++){
//			if (x[i]>max)
//				max=x[i];
//		}
//		System.out.println("Max element is: " +max);
//		int min= x[0];
//		for (i=1; i<100; i++){
//			if (x[i]<min)
//				min=x[i];
//		}
//		System.out.println("Min element is: " +min);
		
		
//		char name[] = new char[]{'R','e','z','n','i','c','h','e','n','k','o',' ','S','v','e','t','l','a','n','a', '\0'};
//		for(int i=0; name[i]!='\0'; i++)
//			System.out.print(name[i]);

//		char name[]= new char[19];
//		Scanner in = new Scanner(System.in);
//		for (int i=0; i<19; i++)
//			name[i]=in.next().charAt(0);
//		char name1[] = new char[]{' ', 'A','n','d','r','e','e','v','n','a'};
		
		int amount = 100;
		for(int i=3; i<100; i++)
			if(x[i]%3==0){
				for(int j=i; j<amount-1; j++){
					x[j]=x[j+1];
					x[amount-1]=0;
				}
				amount--;
			}
		int y[]= new int[amount];
		for (int i=0; i<amount; i++)
			y[i]= x[i];
		for (int i=0; i<amount; i++)
			System.out.println(y[i]);
		
		
	}
}
