/*ͨ��������������һ���������������У�Ȼ��������е�Ԫ�ؽ�������*/
import java.util.*;
public class ArraySort{
	public static void main(String []args){
		Scanner input =new Scanner(System.in);
		System.out.println("����������λѧԱ�ĳɼ�:");
		int a[]= new int [5];
		for(int i=0;i<a.length;i++){
			System.out.println("���������"+i+"λѧԱ�ĳɼ�:");
			a[i]=input.nextInt();
		}
			System.out.println("������ķ�����������ǰΪ:");
				for(int i=0;i<a.length;i++){
					System.out.print(a[i]+"\t");
				}
		Arrays.sort(a);
			System.out.println("\n������ķ������������Ϊ:");
				for(int i=0;i<a.length;i++){
					System.out.print(a[i]+"\t");
				}
	}
}