/*�Ӽ����������ѧ�Ƶĳɼ��������������Ǹ���������ʾ�������*/
import java.util.Scanner;
public class BreakDemo01{
	public static void main(String []args){
		System.out.println("�Ӽ�������5��ѧ�Ƶĳɼ�:");
		Scanner input = new Scanner(System.in);
		int average =0;
		for(int i=1;i<=5;i++){
			int score = input.nextInt();
			System.out.println("��ͬѧ�ĵ�"+i+"�ųɼ���:"+score);
			if(score<0){
				System.out.println("����ĳɼ�����");
				break;
			}
		}
	}
}