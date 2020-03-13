//赋值交换，显示出它的结果。
import java.util.Scanner;
public class Test05{
	public static void main(String [] args){
	Scanner sh = new Scanner(System.in);
	System.out.println("请输入两个数，将它们的值进行转化，显示出它的结果：");
	int number1 = sh.nextInt();
	int number2 = sh.nextInt();
	int number = 0;
	number = number1;
	number1 = number2;
	number2 = number;
	System.out.println	("number1="+number1+","+"number2="+number2);
	}
}
