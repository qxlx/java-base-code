/*����һЩ������20.30,10,20 20 20 40 0���������ǵĺ���ƽ����*/
import java.util.Scanner;
public class Array5{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("��Ӽ���������5�������������ƽ����:");
		int sum =0;
 		double average = 0;
		int [] a = new int[5];
		for(int i=0;i<5;i++){
			int number =input.nextInt();
			a[i]=number;
			sum = sum+a[i];
		}
			System.out.println("sum="+sum+"average="+(sum/5));
	}
}