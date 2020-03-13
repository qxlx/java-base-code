import java.util.Scanner;
//从控制台输出三个数，进行判断输出三个数中较大的数。
public class Demo4{
    public static void main(String []args){
	System.out.println("输入三个整数");
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	int temp;
	int temp1;
	temp = (a>b)?a:b;
	temp1 =  (temp>c)?temp:c;
	System.out.println("三个数中较大值为:"+temp1);		
	
  }
}