package task3;
import java.util.Arrays;
import java.util.Scanner;
public class stroka {
	public static void main(String[] args) {
		String s;
		String[] s1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Введите строку: ");
		s=sc.nextLine();
		int i;
        s1=s.split(" ");
        for(i=0; i<s1.length; i++){
        	s1[i]=s1[i].substring(0, 1).toUpperCase() + s1[i].substring(1);
        }
        Arrays.sort(s1);
        System.out.println("Вы ввели "+i+" слов(a)");
        for(i=0; i<s1.length; i++) { 
            System.out.println(s1[i]); 
        }
	}
}
