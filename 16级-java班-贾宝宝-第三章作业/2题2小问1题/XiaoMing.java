import java.util.Scanner;
/*���С��java�ɼ�����90�֣��������ֳɼ�����80
������һ���ֻ�������java�ɼ�����100�����ֳɼ�
����70�֣�������һ��������*/
public class XiaoMing{
	public static void main(String [] args){
	System.out.println("��ֱ�����С���ĳɼ���");
	Scanner input = new Scanner(System.in);
	int javaScore = input.nextInt();
	int musicScore = input.nextInt();
	if(javaScore>90)
	{
		if(musicScore>80)
			System.out.println("������һ���ֻ�");

	}
	if(javaScore==100){
		if(musicScore>70)
			System.out.println("������һ����");
	}
	if(javaScore<90){
		if(musicScore<70)
			System.out.println("�޽���");
	}
	}
}