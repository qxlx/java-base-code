/*��д����ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��*/
import java.util.Scanner;
public class Demo06{
	public static void main(String []args){
		System.out.println("������һ��ѧ���ɼ���");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		if(score>100){
				System.out.println("���ĳɼ�����");
			}
		if(score>=90&&score<=100){
				System.out.println("���ĳɼ��ȼ�����A");
			}
		if(score>=60&&score<90){
				System.out.println("���ĳɼ��ȼ�����B");
			}
		if(score<60){
				System.out.println("���ĳɼ��ȼ�����C");
			}
	}
}