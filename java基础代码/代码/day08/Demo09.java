/*从键盘输入一个数，用*号打印出一个正方形*/
import java.util.Scanner;
public class Demo09{
	public static void main(String []agrs){
		Scanner input=new Scanner(System.in);
		int number = input.nextInt();
		int i=0; int j=0;
		for(i=1;i<=number;i++){
			System.out.println();
			for(j=1;j<=number;j++){
				System.out.print("* ");	
			}
		} 
	}
}