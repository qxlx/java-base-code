/*�Ӽ�������5������������ǵ�ƽ��ֵ*/
import java.util.Scanner;
public class Average{
	public static void main(String[] args){
		System.out.println("�����������������ǵ�ƽ��ֵ:");
		Scanner input = new Scanner(System.in);
		int number = 0;
		int average1 = 0;
		int n;
		for(n=1;n<=5;n++){
			int i = input.nextInt();
			System.out.println(i);
			number = number + i;
		}
		average1 = number/5;
		System.out.println("ƽ�����ǣ�"+average1);
	}
}