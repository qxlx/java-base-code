import java.util.Scanner;
/* ȥ����ȡǮ����������������123456
��ʾ��¼�ɹ�����ʾ������ȡǮ��������ʾ
����������������롣*/
public class Money{
	public static void main(String [] agrs){
		System.out.println("����ȡǮ");
		System.out.println("���������п�����");
		Scanner input = new Scanner(System.in);
		int passWord =input.nextInt();
		if(passWord == 123456){
			System.out.println("��¼�ɹ�");
			System.out.println("����ȡǮ");
		}
		else{
			System.out.println("�������");
			System.out.println("����������");	
		}
	}
}