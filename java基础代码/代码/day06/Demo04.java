import java.util.Scanner;
/*һ�����ʼƻ�
��Switch�����ʵ�֡�
����һ С�ײ� ���ڶ� ��ײ� ������ ������ 
������  ���� ������ ţ��  ������  ���� 
������ ʲôҲ����*/
public class Demo04{
	public static void main(String[] args ){
	System.out.println("��������������ڼ�");
	Scanner input = new Scanner(System.in);
	int days = input.nextInt();
	switch(days)
	{
		case 1:System.out.println("��С�ײ�");break;
		case 2:System.out.println("�Դ�ײ�");break;
		case 3:System.out.println("�Է�����");break;
		case 4:System.out.println("������");break;
		case 5:System.out.println("��ţ��");break;
		case 6:System.out.println("����");break;
		case 7:System.out.println("ʲôҲ����");break;
		default:System.out.println("���������������");

	}
	}
}
