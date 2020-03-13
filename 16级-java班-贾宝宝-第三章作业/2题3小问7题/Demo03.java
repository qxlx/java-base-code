/*用for 循环计算1000内的奇数的和*/
public class Demo03{
	public static void main(String [] agrs){
		System.out.println("输出1到1000内奇数的和");
		int i = 0;
		int sum = 0;
		for(i=1;i<=1000;i=i+2){
			sum = i+ sum;
		}
			System.out.println("sum="+sum);

	}
}