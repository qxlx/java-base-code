/*����һ�����飬��26����ĸ��̬����������ȥ��Ȼ���ڷ�����ʾ���*/
import java.util.Scanner;
public class Demo01{
	public static void main(String [] agrs){
		System.out.println("������26����дӢ����ĸ:");
		Scanner input=new Scanner(System.in);
		char [] arr=new char[26];
		for(int i=0;i<arr.length;i++){
			String x= input.next();
			char y=x.charAt(0);
			arr[i]=y;
		}
		print(arr);
	}
	public static void print(char [] arr){
		for(int j=arr.length-1;j>=0;j--){
			System.out.print(arr[j]+"\t");
		}
	}
}