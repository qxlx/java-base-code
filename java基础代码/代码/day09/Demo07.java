/*�Ӽ�������5��ѧ���ĳɼ������ƽ���֡�
�������ĳɼ���һ������������ʾ����*/
import java.util.Scanner;
public class Demo07{
	public static void main(String []args){
		int t=0;
		Scanner input = new Scanner(System.in);
		int sum =0;
		for(int i=1;i<=5;i++){
			int score = input.nextInt();
			sum = sum+score; 	
		}
               if(score<0){
			t=1;break;
		System.out.println("�ܳɼ���:"+(sum/5));
		}
		System.out.println("����ĳɼ�����");
		
	}
	
}