//��ϰlf else
import java.util.*;
public class IfElse{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("��������Ŀ��Գɼ�:");
	double  score = input.nextDouble();
	if(score>100)
		System.out.println("������ĳɼ�����");
	else if(score==100)
		System.out.println("����ȥ����");
	else if(score>=90&&score<100)
		System.out.println("����ȥ����԰");
	else if(score>=80&&score<90)
		System.out.println("������һ��mp4");
	else if(score>=60&&score<80)
		System.out.println("������ο���");
	else if(score<60)
		System.out.println("�ڼҺúø�ϰ");
	
	}
}