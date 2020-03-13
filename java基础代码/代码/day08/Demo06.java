/*用switch完成。让用户输出1-12 求出对应的季节*/
import java.util.Scanner;
public class Demo06{
	public static void main(String []agrs){
		System.out.println("从键盘输入一个整数1到12之间，求出对应的季节:");
		Scanner input = new Scanner(System.in);
		int yuefen = input.nextInt();
		switch(yuefen){
			case 3:
			case 4:
			case 5:System.out.println(yuefen+"对应的季节是春季");break;
			case 6:
			case 7:
			case 8:System.out.println(yuefen+"对应的季节是夏季");break;
			case 9:
			case 10:
			case 11:System.out.println(yuefen+"对应的季节是秋季");break;
			case 12:
			case 1:
			case 2:System.out.println(yuefen+"对应的季节是冬季");break;
			default:System.out.println(yuefen+"没有对应的季节");break;
		}
	}
}