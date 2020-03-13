//输入两个数，a,b;交换它们的值，最后输出来。
import java.util.Scanner;
public class Demo07{
	public static void main(String [] args){
		System.out.println("输入两个数，进行转换");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int sum = number1 + number2;  
		number1 = sum - number1;      
		number2 = sum - number2;
		System.out.println		("number1="+number1+","+"number2="+number2);
	
	}
}