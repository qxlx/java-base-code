//��Switchʵ�ֶ�֧�·�ѡ��������Ч��
import java.util.Scanner;
public class Month{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ��ʾ���·�:");
		int months = input.nextInt();
		switch(months)	
		{
			case 1:System.out.println("1�·�Ϊ31��");break;
			case 2:System.out.println("2�·�Ϊ28��");break;
			case 3:System.out.println("3�·�Ϊ31��");break;
			case 4:System.out.println("4�·�Ϊ30��");break;
			case 5:System.out.println("5�·�Ϊ31��");break;
			case 6:System.out.println("6�·�Ϊ30��");break;
			case 7:System.out.println("7�·�Ϊ31��");break;
			case 8:System.out.println("8�·�Ϊ31��");break;
			case 9:System.out.println("9�·�Ϊ30��");break;
			case 10:System.out.println("10�·�Ϊ31��");break;
			case 11:System.out.println("11�·�Ϊ30��");break;
			case 12:System.out.println("12�·�Ϊ31��");break;
			default:System.out.println("��������·�������");


		}
	}
}