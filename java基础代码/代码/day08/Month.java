/*让用户从键盘输入一个月份显示出为什么季节
春季 345  夏季678  秋季 9 10 11  冬季12 1 2
*/
import java.util.Scanner;
public class  Month{
	public static void main(String [] agrs){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个月份：");
		int yuefen = input.nextInt();
		if(yuefen>12||yuefen<1)
			System.out.println(yuefen+"没有对应的季节");
		else if(yuefen>=3&&yuefen<=5)
			System.out.println(yuefen+"对应的季节是春季");
		else if(yuefen>=6&&yuefen<=8)
			System.out.println(yuefen+"对应的季节是夏季");
		else if(yuefen>=9&&yuefen<=11)
			System.out.println(yuefen+"对应的季节是秋季");
		else 
			System.out.println(yuefen+"对应的季节是冬季");			
	}
}