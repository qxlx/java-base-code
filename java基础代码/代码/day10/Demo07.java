/*有switch语句编写一个完成两个整数四则运算的程序。*/
import java.util.Scanner;
public class Demo07{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输出一个数，进行加减乘除操作:");
		int number = 20; int number1 = 21;
		System.out.println("请输入1");
		int panduan = input.nextInt();
		switch(panduan){
		 	case 1:System.out.println("两数相加结果是"+(number+number1));
			case 2:System.out.println("两数相减结果是"+(number-number1));
			case 3:System.out.println("两数相乘结果是"+(number*number1));
			case 4:System.out.println("两数相除结果是"+(number/number1));break;
		


		}
	}
}