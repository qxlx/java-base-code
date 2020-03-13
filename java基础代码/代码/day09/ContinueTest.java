/*使用循环从键盘输入java同学的每个成绩，统计大于80分的学生的比例*/
import java.util.Scanner;
public class ContinueTest{
	public  static void main(String []agrs){
		Scanner input = new Scanner(System.in);
		System.out.println("从键盘输入java班的人数:");
		double renshu  = input.nextDouble();
		System.out.println("从键盘输入每个同学的java成绩");
		double  sum=0;
		for(int i=1;i<=renshu;i++){
			int score =input.nextInt();
			System.out.println("第"+i+"位同学的java成绩是："+score);
			if(score<80){
				continue;
				   }
			sum++;
			System.out.println("sum="+sum);
		}
		System.out.println("全班分数大于等于80的学生比例为:"+(sum/renshu)*100+"%");
	}
}