package task5;
import java.util.Scanner;
public class palindroms {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		String s;
		Integer j;
		System.out.print("¬ведите целое число: ");
		i=sc.nextInt();
		for(j=0; j<=i; j++){
			s="";
			for(int w=j.toString().length()-1; w>=0; w--){
		            s=s+j.toString().charAt(w);
		        }
			if (j.toString().equals(s)) {
				System.out.println(j+" ");
			}
		}
	}
}
