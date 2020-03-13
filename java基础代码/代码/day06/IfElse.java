//练习lf else
import java.util.*;
public class IfElse{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入你的考试成绩:");
	double  score = input.nextDouble();
	if(score>100)
		System.out.println("你输入的成绩有误");
	else if(score==100)
		System.out.println("带你去旅游");
	else if(score>=90&&score<100)
		System.out.println("带你去动物园");
	else if(score>=80&&score<90)
		System.out.println("给你买一部mp4");
	else if(score>=60&&score<80)
		System.out.println("给你买参考书");
	else if(score<60)
		System.out.println("在家好好复习");
	
	}
}