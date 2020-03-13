/*编写程序：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。*/
import java.util.Scanner;
public class Demo06{
	public static void main(String []args){
		System.out.println("请输入一个学生成绩：");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		if(score>100){
				System.out.println("您的成绩有误");
			}
		if(score>=90&&score<=100){
				System.out.println("您的成绩等级属于A");
			}
		if(score>=60&&score<90){
				System.out.println("您的成绩等级属于B");
			}
		if(score<60){
				System.out.println("您的成绩等级属于C");
			}
	}
}