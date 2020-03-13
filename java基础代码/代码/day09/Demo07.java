/*从键盘输入5个学生的成绩，求出平均分。
如果输入的成绩是一个负数，则提示错误。*/
import java.util.Scanner;
public class Demo07{
	public static void main(String []args){
		int t=0;
		Scanner input = new Scanner(System.in);
		int sum =0;
		for(int i=1;i<=5;i++){
			int score = input.nextInt();
			sum = sum+score; 	
		}
               if(score<0){
			t=1;break;
		System.out.println("总成绩是:"+(sum/5));
		}
		System.out.println("输入的成绩错误");
		
	}
	
}