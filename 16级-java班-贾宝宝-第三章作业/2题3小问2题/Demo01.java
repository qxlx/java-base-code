/*����һ����ֵ���ֱ������������������������㡣��while���
��������һ��5  ������������m,n;  */
import java.util.Scanner;
public class Demo01{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("����һ����ֵ:");
		int number =input.nextInt();
		int a = 0;
		int b = number;
		while(a<=number&&b>=0){//  a    b 
			System.out.println(a+"+"+b+"="+number);
			a++;
			b--;
		}
	
		
	}
}
