/*从键盘输入5个数，求出它们的平均值*/
import java.util.Scanner;
public class Average{
	public static void main(String[] args){
		System.out.println("输入五个数，求出它们的平均值:");
		Scanner input = new Scanner(System.in);
		int number = 0;
		int average1 = 0;
		int n;
		for(n=1;n<=5;n++){
			int i = input.nextInt();
			System.out.println(i);
			number = number + i;
		}
		average1 = number/5;
		System.out.println("平均数是："+average1);
	}
}