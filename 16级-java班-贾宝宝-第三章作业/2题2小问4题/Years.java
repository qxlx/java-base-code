/*�ж�������Ƿ�������*/
import java.util.Scanner;
public class Years{
	public static void main(String[] agrs)
	{
		System.out.println("���ֶ�����һ����ݣ��ж��Ƿ������꣺");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int leap = 2;
		if(year%4 == 0)	
		{
			if(year%100 == 0)
			{  
					if(year%400 == 0)
					{
					  leap = 1;
					}
					else
					  leap = 0;
			}
			else
			  leap = 1;	
		}
		else   
		  leap = 0;
		if(leap == 1)
			System.out.println("������");
		else 
			System.out.println("��������");
		
	}
}