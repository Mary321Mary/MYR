package task2;
import java.util.Scanner;
public class nodinok {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0, b=0, i, q=0, j;
		try{
			System.out.print("������� ������ ����� �����: ");
			a=sc.nextInt();
			System.out.print("������� ������ ����� �����: ");
			b=sc.nextInt();
			if(a>b){
				i=b;
			}
			else{
				i=a;
			}
			for(;i>1;i--){
		        if((b%i==0) && (a%i==0)){
		            break;
		        }
		    }
			if(i>1){
		    	System.out.println("�����"+" "+i+" "+"�������� ����� ���� �����");
		    }
		    else {
		    	System.out.println("��� ���� ���� �����");	
		    }
			if(a>b){
				i=a;
				j=a*a;
			}
			else{
				i=b;
				j=b*b;
			}
			for(;i<j;i++){
		        if((i%b==0) && (i%a==0)){
		            break;
		        }
		    }
			if(i<j){
		    	System.out.println("�����"+" "+i+" "+"�������� ����� ���� �����");
		    }
		    else {
		    	System.out.println("��� ���� ���� �����");	
		    }
		}catch(Exception e){System.out.print("������� ���������� �����");}
	}

}
