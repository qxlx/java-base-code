import java.util.Scanner;
/* Ҫ���û�����a,b����ֵ��
b/a==0����a+b>1000 ���a��ֵ
�������b��ֵ��*/
public class Ab{
	public static void main(String [] args){
		System.out.println("����a,b��ֵ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		if((b/a == 0)||((a+b)>1000))
			System.out.println("a��ֵ"+a);
		else
  			System.out.println("b��ֵ"+b);
		
	}
}
