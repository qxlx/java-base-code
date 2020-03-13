/*使用数组，从键盘输入5个数，求出5个数的总数*/
import java.util.Scanner;
public class Array2{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int [] a =new int[5];//  类型 []数组名 = new 类型[]
		System.out.println("从键盘输入五个数字:");
		for(int i=0;i<5;i++){
			a[i] = input.nextInt();
		}
		 int sum=a[0]+a[1]+a[2]+a[3]+a[4];
		System.out.println("sum="+sum);
	}
}