//��ֵ��������ʾ�����Ľ����
import java.util.Scanner;
public class Test05{
	public static void main(String [] args){
	Scanner sh = new Scanner(System.in);
	System.out.println("�������������������ǵ�ֵ����ת������ʾ�����Ľ����");
	int number1 = sh.nextInt();
	int number2 = sh.nextInt();
	int number = 0;
	number = number1;
	number1 = number2;
	number2 = number;
	System.out.println	("number1="+number1+","+"number2="+number2);
	}
}
