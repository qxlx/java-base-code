/*ʹ�����飬�Ӽ�������5���������5����������*/
import java.util.Scanner;
public class Array2{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int [] a =new int[5];//  ���� []������ = new ����[]
		System.out.println("�Ӽ��������������:");
		for(int i=0;i<5;i++){
			a[i] = input.nextInt();
		}
		 int sum=a[0]+a[1]+a[2]+a[3]+a[4];
		System.out.println("sum="+sum);
	}
}