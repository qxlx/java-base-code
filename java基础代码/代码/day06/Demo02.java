/*��ϰif  boolean  
����������2000�������õĻ�ȥ���Σ�����ȥ�̳����
����������1000����С��2000�������õĻ�ȥ��԰תת������ȥ��꿴��
�������С��1000���ʹ��ڼ��￴���ӡ�*/
import java.util.Scanner;
public class Demo02{
	public static void main(String [] args ){
		Scanner input = new Scanner(System.in);
		System.out.println("�����뽱�����Ŀ:");
		int money = input.nextInt();
		System.out.println("1���������ã�2����������");
		int weather = input.nextInt();
		boolean a = (weather==1?true:false);
		if (money>2000)
		{
			if(a==true)
				System.out.println("�����ã�ȥ����");
			else
				System.out.println("�����ȥ�̳�����");
		}
		if(money>=1000&&money<2000)
		{
			if(a==true)
				System.out.println("������ȥ��԰תת");
			else
				System.out.println("������ȥ��꿴��");
		}
		if(money<1000)
		{
			System.out.println("���ڼҿ�����");
		}
	}
}