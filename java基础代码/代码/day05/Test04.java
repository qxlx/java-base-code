//��Բ����������
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
	Scanner sh = new Scanner(System.in);
	System.out.println("�ֱ�����һ��Բ����ĸߺ͵���뾶");
	double h = sh.nextDouble();
	double r = sh.nextDouble();
	float PI = 3.14f;
	double v = PI*r*r*h;
	System.out.println("Բ������ǣ�"+v);
	}
}