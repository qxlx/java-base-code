/*ʹ��ѭ���Ӽ�������javaͬѧ��ÿ���ɼ���ͳ�ƴ���80�ֵ�ѧ���ı���*/
import java.util.Scanner;
public class ContinueTest{
	public  static void main(String []agrs){
		Scanner input = new Scanner(System.in);
		System.out.println("�Ӽ�������java�������:");
		double renshu  = input.nextDouble();
		System.out.println("�Ӽ�������ÿ��ͬѧ��java�ɼ�");
		double  sum=0;
		for(int i=1;i<=renshu;i++){
			int score =input.nextInt();
			System.out.println("��"+i+"λͬѧ��java�ɼ��ǣ�"+score);
			if(score<80){
				continue;
				   }
			sum++;
			System.out.println("sum="+sum);
		}
		System.out.println("ȫ��������ڵ���80��ѧ������Ϊ:"+(sum/renshu)*100+"%");
	}
}