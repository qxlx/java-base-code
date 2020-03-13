/*从键盘输入五个学科的成绩，如果输出分数是负数，则提示输入错误。*/
import java.util.Scanner;
public class BreakDemo01{
	public static void main(String []args){
		System.out.println("从键盘输入5个学科的成绩:");
		Scanner input = new Scanner(System.in);
		int average =0;
		for(int i=1;i<=5;i++){
			int score = input.nextInt();
			System.out.println("该同学的第"+i+"门成绩是:"+score);
			if(score<0){
				System.out.println("输入的成绩有误");
				break;
			}
		}
	}
}