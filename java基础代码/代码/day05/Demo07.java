//������������a,b;�������ǵ�ֵ������������
import java.util.Scanner;
public class Demo07{
	public static void main(String [] args){
		System.out.println("����������������ת��");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int sum = number1 + number2;  
		number1 = sum - number1;      
		number2 = sum - number2;
		System.out.println		("number1="+number1+","+"number2="+number2);
	
	}
}