/*需求 用户要求实现一个这样的功能，写一个方法，输入任意一个整数，返回它的阶乘

*/
import java.util.Scanner;
public class Demo01{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int teger=input.nextInt();
		int result=print(teger);
		System.out.println("result="+result);
	}
	public static int  print(int n){
		int m=1; 
		for(int i=2;i<=n;i++){
			m=m*i;
			
	}
	return m;
}
}