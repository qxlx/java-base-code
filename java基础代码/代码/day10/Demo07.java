/*��switch����дһ���������������������ĳ���*/
import java.util.Scanner;
public class Demo07{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("�����һ���������мӼ��˳�����:");
		int number = 20; int number1 = 21;
		System.out.println("������1");
		int panduan = input.nextInt();
		switch(panduan){
		 	case 1:System.out.println("������ӽ����"+(number+number1));
			case 2:System.out.println("������������"+(number-number1));
			case 3:System.out.println("������˽����"+(number*number1));
			case 4:System.out.println("������������"+(number/number1));break;
		


		}
	}
}