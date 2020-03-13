//练习题3 p93
import java.util.Scanner;
public class Test06{
	public static void main(String [] args){
	Scanner sh = new Scanner(System.in);
	System.out.println("加密结果=(整数*10+5)/2+3.14159");
	System.out.println("输入一个整数：");
	int integer = sh.nextInt();
	int result;
	result = (int)((integer*10+5)/2+3.14159);
	System.out.println("result:"+result);
	}
	
}