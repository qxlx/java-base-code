/*共3个班级，3个班级各有4名学员参赛，计算每个班级参赛学员*/
import java.util.Scanner;
public class ForArray{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.println("请您输入第"+i+"个班级的学生成绩:");
			int sum = 0;
			for(int j=1;j<=4;j++){
				System.out.println("请您输入第"+j+"个学生的成绩:");
				int score = input.nextInt(); 
				sum=sum+score;
			}
			 	System.out.println("第"+i+"班平均成绩是:"+(sum/4));
		}
			
	}
}