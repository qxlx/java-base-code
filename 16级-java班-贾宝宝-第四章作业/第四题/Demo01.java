/*���� �û�Ҫ��ʵ��һ�������Ĺ��ܣ�дһ����������������һ���������������Ľ׳�

*/
import java.util.Scanner;
public class Demo01{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������:");
		int teger=input.nextInt();
		int result=print(teger);
		System.out.println("result="+result);
	}
	public static int  print(int n){
		int m=1; 
		for(int i=2;i<=n;i++){
			m=m*i;
			
	}
	return m;
}
}