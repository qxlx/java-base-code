//�û��������һЩ�����ڿ���̨����ʾ����Щ���ֵĺ���ƽ��ֵ
import java.util.Scanner;
public class AddDemo{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int [] arr= new int [5];
		int sum=0;  int average =0;  int j=0;
		System.out.println("������һ������:");
		for(int i=0;i<arr.length;i++){
			int x=input.nextInt();
			arr[i]=x;
			sum=sum+arr[i];
			j++;
		}
		System.out.println("��������������:"+sum);
		System.out.println("��������ƽ��ֵ��:"+sum/j);
	}
}