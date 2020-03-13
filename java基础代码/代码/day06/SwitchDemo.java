/*令狐冲比武
如果是第一名就出任武林盟主。
如果是第二名就出任武当掌门。
如果是第三名就出任峨眉派掌门。
其他情况逐出师门。*/
import java.util.Scanner;
public class SwitchDemo{
	public static void main(String [] args ){
	Scanner  input = new Scanner(System.in);
	int mingCi = input.nextInt();
	switch(mingCi)
	{
		case 1:System.out.println("第一名，出任武林盟主");break;
		case 2 :System.out.println("第二名，出任武当掌门");break;
		case 3 :System.out.println("第三名，出任峨眉派掌门");break;
		default:System.out.println("被逐出师门");		
	




	}
	}
}