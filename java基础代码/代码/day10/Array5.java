/*给定一些数，如20.30,10,20 20 20 40 0，计算它们的和与平均数*/
import java.util.Scanner;
public class Array5{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("请从键盘上输入5个数，求出和与平均数:");
		int sum =0;
 		double average = 0;
		int [] a = new int[5];
		for(int i=0;i<5;i++){
			int number =input.nextInt();
			a[i]=number;
			sum = sum+a[i];
		}
			System.out.println("sum="+sum+"average="+(sum/5));
	}
}