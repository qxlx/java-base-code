//用Switch实现多支月份选择天数的效果
import java.util.Scanner;
public class Month{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("输入你要显示的月份:");
		int months = input.nextInt();
		switch(months)	
		{
			case 1:System.out.println("1月份为31天");break;
			case 2:System.out.println("2月份为28天");break;
			case 3:System.out.println("3月份为31天");break;
			case 4:System.out.println("4月份为30天");break;
			case 5:System.out.println("5月份为31天");break;
			case 6:System.out.println("6月份为30天");break;
			case 7:System.out.println("7月份为31天");break;
			case 8:System.out.println("8月份为31天");break;
			case 9:System.out.println("9月份为30天");break;
			case 10:System.out.println("10月份为31天");break;
			case 11:System.out.println("11月份为30天");break;
			case 12:System.out.println("12月份为31天");break;
			default:System.out.println("你输入的月份有问题");


		}
	}
}