package task1;
import java.util.Scanner;
public class chetn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0, q=0;
		System.out.print("Введите целое число: ");
		if (sc.hasNextInt()) {
			i=sc.nextInt();
		    if (i%2==0){
		    	System.out.println("Число"+" "+i+" "+"четное");
		    } else {
		    	System.out.println("Число"+" "+i+" "+"нечетное");
		    }
		    for(int j=2; j*j<=i; j++)
		    	if(i%j==0) q++;
		    if(q>0){
		    	System.out.println("Число"+" "+i+" "+"составное");
		    }
		    else {
		    	System.out.println("Число"+" "+i+" "+"простое");	
		    }
		} else {
	    	System.out.println("Вы ввели неверное число");			
		}
	}
}
