package task4;
import java.util.Scanner;
public class vstrecha {
	public static void main(String[] args) {
		String s, sub;
		Scanner sc=new Scanner(System.in);
		System.out.print("Введите строку: ");
		s=sc.nextLine();
		System.out.print("Введите подстроку: ");
		sub=sc.nextLine();
		int result=0, j=s.length(), i;
        for (i=0; i<j; i++) {
            if (s.substring(i, i+sub.length()).equalsIgnoreCase(sub)) {
                result++;
                i+=sub.length();
            }
        }
        System.out.println("Подстрока "+sub+" встречается в строке "+s+" "+result+" раз(а)");
	}
}
