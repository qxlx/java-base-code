/*���û��Ӽ�������һ���·���ʾ��Ϊʲô����
���� 345  �ļ�678  �＾ 9 10 11  ����12 1 2
*/
import java.util.Scanner;
public class  Month{
	public static void main(String [] agrs){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ���·ݣ�");
		int yuefen = input.nextInt();
		if(yuefen>12||yuefen<1)
			System.out.println(yuefen+"û�ж�Ӧ�ļ���");
		else if(yuefen>=3&&yuefen<=5)
			System.out.println(yuefen+"��Ӧ�ļ����Ǵ���");
		else if(yuefen>=6&&yuefen<=8)
			System.out.println(yuefen+"��Ӧ�ļ������ļ�");
		else if(yuefen>=9&&yuefen<=11)
			System.out.println(yuefen+"��Ӧ�ļ������＾");
		else 
			System.out.println(yuefen+"��Ӧ�ļ����Ƕ���");			
	}
}