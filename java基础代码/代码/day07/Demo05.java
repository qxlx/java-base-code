/*��ϰ���ʱ��ѯ����ʦ ��ʦ˵Yes  �������������������Ȼ
������� ����Ŭ����д����*/
import java.util.Scanner;
public class Demo05{
	public static void main(String [] args){
		System.out.println("��ʦ,��д�ĳ�����ô��");
		Scanner input = new Scanner(System.in);
		String   result;
		result = input.next();
		while(! result.equalsIgnoreCase("n")){
			System.out.println("������ϰ����");
			System.out.println("�ú�ѧ");
			result = input.next();
			}
			System.out.println("�������ɣ�������Ȼ");
	}
}
