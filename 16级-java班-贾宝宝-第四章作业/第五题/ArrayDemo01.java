/*ʹ�õݹ鷽�����������1��10֮�����*/
public class ArrayDemo01{
	public static void main(String [] args){
		System.out.println("�����δ�ӡ��1��10֮�����:");
		int i=1;
		print(i);	
	}
	public static int print(int n){
		if(n<=10){
		System.out.print(n+" ");
		}
		else  return -1;
		return print(n+1);
	}
}