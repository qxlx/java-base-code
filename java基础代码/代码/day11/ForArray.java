/*��3���༶��3���༶����4��ѧԱ����������ÿ���༶����ѧԱ*/
import java.util.Scanner;
public class ForArray{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.println("���������"+i+"���༶��ѧ���ɼ�:");
			int sum = 0;
			for(int j=1;j<=4;j++){
				System.out.println("���������"+j+"��ѧ���ĳɼ�:");
				int score = input.nextInt(); 
				sum=sum+score;
			}
			 	System.out.println("��"+i+"��ƽ���ɼ���:"+(sum/4));
		}
			
	}
}