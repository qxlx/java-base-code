/*��switch��ɡ����û����1-12 �����Ӧ�ļ���*/
import java.util.Scanner;
public class Demo06{
	public static void main(String []agrs){
		System.out.println("�Ӽ�������һ������1��12֮�䣬�����Ӧ�ļ���:");
		Scanner input = new Scanner(System.in);
		int yuefen = input.nextInt();
		switch(yuefen){
			case 3:
			case 4:
			case 5:System.out.println(yuefen+"��Ӧ�ļ����Ǵ���");break;
			case 6:
			case 7:
			case 8:System.out.println(yuefen+"��Ӧ�ļ������ļ�");break;
			case 9:
			case 10:
			case 11:System.out.println(yuefen+"��Ӧ�ļ������＾");break;
			case 12:
			case 1:
			case 2:System.out.println(yuefen+"��Ӧ�ļ����Ƕ���");break;
			default:System.out.println(yuefen+"û�ж�Ӧ�ļ���");break;
		}
	}
}