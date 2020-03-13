//选择条件语句练习
import java.util.*;
public class If{
	public static void main(String [] args ){
	int jiangjin = 500;
	Scanner input = new Scanner(System.in);
	System.out.println("请输入你的奖金数目:");
	int in = input.nextInt();
	if(in==jiangjin){
		System.out.println("恭喜你中奖500万");
		System.out.println("买房");
		System.out.println("买车");
		System.out.println("结婚");		
		}
	else 
		System.out.println("继续单身狗生活");
	}
}