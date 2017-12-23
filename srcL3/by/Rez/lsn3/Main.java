package by.Rez.lsn3;
import java.util.Scanner;

public class Main {
	public int add(){
		int value = 0+ (int)(Math.random()*100);
		return value;
	}
	public boolean even(int value){
		if (value%2==0)
			return true;
		else return false;
	}
	
	public boolean notEven(int value){
		if (value%2!=0)
			return true;
		else return false;
	}
	
	public void outputEven(int value){
		if(even(value))
			System.out.println(value);
	}
	public int difference(int value){
		int dif=0;
		if(notEven(value))
			dif=-value;
		return dif;
	}
	public int amount(int value){
		int amount=0;
		if(even(value))
			amount++;
		return amount;
	}
	
	public int amountNE(int value){
		int amount=0;
		if(!even(value))
			amount++;
		return amount;
	}
	public int findMax(int x[]){
		int max= x[0];
		for (int i=1; i<100; i++){
			if (x[i]>max)
				max=x[i];
		}
		return max;
	}
	public int findMin(int x[]){
		int min= x[0];
		for (int i=1; i<100; i++){
		if (x[i]<min)
			min=x[i];
		}
		return min;
	}
	
	public FindEven findEven(int x[]) {
		FindEven ob = new FindEven();
		int pos1 = 0, max1 = 0, min1 = 0, i = 0;
		for (i = 2; i < 100; i++) {
			if (x[i] % 2 == 0) {
				ob.max1 = max1 = x[i];
				ob.min1 = min1 = x[i];
				pos1 = i;
			}
			break;
		}
		for (i = pos1; i < 100; i++) {
			if (x[i] % 2 == 0) {
				if (x[i] > max1)
					ob.max1 = max1 = x[i];
				if (x[i] < min1)
					ob.min1 = min1 = x[i];
			}
		}
		return ob;
	}
	
	public FindNotEven findNotEven (int x[]){
		FindNotEven ob = new FindNotEven();
		int pos2=0, i=0, max2=0, min2=0;
		for(i=1; i<100; i++){
		if (x[i]%2!=0){
			ob.max2 =  max2 = x[i];
			ob.min2 =  min2 = x[i];
			pos2=i;
		}
		break;
	}
		for(i=1; i<100; i++){
		if (x[i]%2!=0){
			ob.max2 =  max2 = x[i];
			ob.min2 =  min2 = x[i];
			pos2=i;
		}
		break;
	}
		return ob;
	}
	
	public void name(){
		char name[] = new char[]{'R','e','z','n','i','c','h','e','n','k','o',' ','S','v','e','t','l','a','n','a', '\0'};
		for(int i=0; name[i]!='\0'; i++)
			System.out.print(name[i]);
	}
	
	public void inputName(){
		Scanner in = new Scanner(System.in);
		char name[]= new char[30];;
		for (int i=0; i<30; i++)
			name[i]=in.next().charAt(0);
	}
	
	public void fio(){
		char name[] = new char[]{'R','e','z','n','i','c','h','e','n','k','o',' ','S','v','e','t','l','a','n','a',' ', 'A','n','d','r','e','e','v','n','a','\0'};
		for(int i=0; name[i]!='\0'; i++)
			System.out.print(name[i]);
	}
	
	public int delete(int x[]){
		int amount = 100;
		for(int i=3; i<100; i++)
			if(x[i]%3==0){
				for(int j=i; j<amount-1; j++){
					x[j]=x[j+1];
					x[amount-1]=0;
				}
				amount--;
			}
		return amount;
	}

	public void createArray(int amount, int x[]){
		int y[]= new int[amount];
		for (int i=0; i<amount; i++)
			y[i]= x[i];
		for (int i=0; i<amount; i++)
			System.out.println(y[i]);
	}
	
	public void range(int num, int beg, int end){
		if (num>=beg && num<= end)
		System.out.println(num);
	}
	
	public void sort1(int x[]){
		int min = 0;
		for (int i = 0; i<100-1; i++){
	        min = i;
	        for (int j = i+1; j < 100; j++){
	            if (x[j] < x[min])
	                min = j;
	        }
	        int value = x[min];
	        x[min] = x[i];
	        x[i] = value;
	    }
		for(int i=0; i<100; i++){
			System.out.println(x[i]);
		}
	}
	
	public void sort2(int x[]) {
		for (int i = 1; i < 100; i++)
			for (int j = i; j > 0 && x[j - 1] > x[j]; j--) {
				int value = x[j - 1];
				x[j - 1] = x[j];
				x[j] = value;
			}
		for (int i = 0; i < 100; i++) {
			System.out.println(x[i]);
		}

	}
	
	void sort3 (int x[]) {
        for (int i = 100-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (x[j] > x[j + 1]) {
                    int value = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = value;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
			System.out.println(x[i]);
		}
}
	
	public static void main(String[] args) {
		
		int x[] = new int[100];
		int i=0,dif=0, amountE=0, amountNE=0, max1=0, min1=0, max2=0, min2=0;
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		for(i=0; i<100; i++){
			x[i]= main.add();
		}
		
		for(i=0; i<100; i++)
			main.outputEven(x[i]);
		
		for(i=0; i<100; i++)
			dif+=main.difference(x[i]);
		
		for(i=0; i<100; i++)
			if(main.even(x[i]))
				amountE++;
			else if(main.notEven(x[i]))
				amountNE++;
			
		System.out.println("The amount of Even and Not Even is: " +amountE +' '+ amountNE);
		
		FindEven ob = new FindEven();
		FindNotEven ob1 = new FindNotEven();
		ob = main.findEven(x);
		ob1 = main.findNotEven(x);
		System.out.println("Max and min element of even numbers is: "+ ob.max1+' '+ ob.min1);
		System.out.println("Max and min element of not even numbers is: "+ ob1.max2+' '+ ob1.min2);
		
		int beg=0, end=0;
		System.out.println("Input the end and the begin");
		beg = in.nextInt();
		end = in.nextInt();
		for (i=0; i<100; i++){
			main.range(x[i], beg, end);
		}
		System.out.println(" ");
	
		main.sort1(x);
		main.sort2(x);
		main.sort3(x);
	}
}