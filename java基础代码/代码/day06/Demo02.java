/*练习if  boolean  
如果奖金大于2000，天气好的话去郊游，否则去商场购物。
如果奖金大于1000而且小于2000，天气好的话去公园转转，否则去书店看书
如果奖金小于1000，就待在家里看电视。*/
import java.util.Scanner;
public class Demo02{
	public static void main(String [] args ){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入奖金的数目:");
		int money = input.nextInt();
		System.out.println("1代表天气好，2代表天气差");
		int weather = input.nextInt();
		boolean a = (weather==1?true:false);
		if (money>2000)
		{
			if(a==true)
				System.out.println("天气好，去郊游");
			else
				System.out.println("天气差，去商场购物");
		}
		if(money>=1000&&money<2000)
		{
			if(a==true)
				System.out.println("天气好去公园转转");
			else
				System.out.println("天气差去书店看书");
		}
		if(money<1000)
		{
			System.out.println("待在家看电视");
		}
	}
}