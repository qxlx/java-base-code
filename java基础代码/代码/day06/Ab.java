import java.util.Scanner;
/* 要求用户输入a,b两个值。
b/a==0或者a+b>1000 输出a的值
否则输出b的值。*/
public class Ab{
	public static void main(String [] args){
		System.out.println("输入a,b的值");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		if((b/a == 0)||((a+b)>1000))
			System.out.println("a的值"+a);
		else
  			System.out.println("b的值"+b);
		
	}
}
