//�����Ż�
import java.util.Scanner;
public class Array1{
	public static void main(String []args){
		int [] a = {3,6,5,8,9,10};
		int [] b =new int [12];
			System.out.println("���ƿ�ʼ֮ǰa��Ԫ��Ϊ:");
		printlnArray(a);
			System.out.println("");
			System.out.println("���ƿ�ʼ֮ǰb��Ԫ��Ϊ:");
		printlnArray(b);
			System.out.println("");
			System.out.println("���ƿ�ʼ֮��b��Ԫ��Ϊ:");
		printlnArray(b);
	}
		public static void printlnArray (int [] array){
			for(int  i=0;i<array.length;i++){
				System.out.print(array[i]+" ");
			}
		}
}