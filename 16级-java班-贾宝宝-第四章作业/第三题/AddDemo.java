//用户随机输入一些数，在控制台上显示出这些数字的和与平均值
import java.util.Scanner;
public class AddDemo{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int [] arr= new int [5];
		int sum=0;  int average =0;  int j=0;
		System.out.println("请输入一下整数:");
		for(int i=0;i<arr.length;i++){
			int x=input.nextInt();
			arr[i]=x;
			sum=sum+arr[i];
			j++;
		}
		System.out.println("这个数组的总数是:"+sum);
		System.out.println("这个数组的平均值是:"+sum/j);
	}
}