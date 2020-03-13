//求圆柱体的体积。
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
	Scanner sh = new Scanner(System.in);
	System.out.println("分别输入一个圆柱体的高和底面半径");
	double h = sh.nextDouble();
	double r = sh.nextDouble();
	float PI = 3.14f;
	double v = PI*r*r*h;
	System.out.println("圆柱体积是："+v);
	}
}