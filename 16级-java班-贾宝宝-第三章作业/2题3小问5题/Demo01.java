/*从键盘上输入一个5位数，结果显示为各个位数相加之和
12345  12345  12%10  123 23  1234    45
*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		System.out.println("从键盘上输入一个5位数:");
		Scanner input = new Scanner(System.in);
		int total = input.nextInt();
		int a=0; int b=0;int c=0; int d=0; int e=0; int sum = 0;
		a = total/10000;
		b = (total/1000)%10;
		c =((total/100)%100)%10;
		d =(total%100)/10;
		e =total%10;
		sum =a+b+c+d+e;
		System.out.println(a+"+"+b+"+"+c+"+"+d+"+"+e+"="+sum);
	}
}