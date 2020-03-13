import java.util.Scanner;
/*一个减肥计划
用Switch语句来实现。
星期一 小白菜 星期二 大白菜 星期三 方便面 
星期四  猪肉 星期五 牛肉  星期六  燕窝 
星期日 什么也不吃*/
public class Demo04{
	public static void main(String[] args ){
	System.out.println("请输入今天是星期几");
	Scanner input = new Scanner(System.in);
	int days = input.nextInt();
	switch(days)
	{
		case 1:System.out.println("吃小白菜");break;
		case 2:System.out.println("吃大白菜");break;
		case 3:System.out.println("吃方便面");break;
		case 4:System.out.println("吃猪肉");break;
		case 5:System.out.println("吃牛肉");break;
		case 6:System.out.println("燕窝");break;
		case 7:System.out.println("什么也不吃");break;
		default:System.out.println("你输入的星期有误");

	}
	}
}
