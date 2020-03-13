/*判断输入的是否是闰年*/
import java.util.Scanner;
public class Years{
	public static void main(String[] agrs)
	{
		System.out.println("请手动输入一个年份，判断是否是闰年：");
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
			System.out.println("是闰年");
		else 
			System.out.println("不是闰年");
		
	}
}