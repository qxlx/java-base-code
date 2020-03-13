/*练习编程时，询问老师 老师说Yes  则输出生活依旧梦想依然
否则输出 继续努力，写代码*/
import java.util.Scanner;
public class Demo05{
	public static void main(String [] args){
		System.out.println("老师,我写的程序怎么样");
		Scanner input = new Scanner(System.in);
		String   result;
		result = input.next();
		while(! result.equalsIgnoreCase("n")){
			System.out.println("继续练习程序");
			System.out.println("好好学");
			result = input.next();
			}
			System.out.println("生活依旧，梦想依然");
	}
}
