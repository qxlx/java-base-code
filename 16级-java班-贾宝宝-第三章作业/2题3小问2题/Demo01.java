/*输入一个数值，分别输出两个加数，进行求和运算。用while解决
例如输入一个5  给定两个变量m,n;  */
import java.util.Scanner;
public class Demo01{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个数值:");
		int number =input.nextInt();
		int a = 0;
		int b = number;
		while(a<=number&&b>=0){//  a    b 
			System.out.println(a+"+"+b+"="+number);
			a++;
			b--;
		}
	
		
	}
}
