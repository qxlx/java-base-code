//代码优化
import java.util.Scanner;
public class Array1{
	public static void main(String []args){
		int [] a = {3,6,5,8,9,10};
		int [] b =new int [12];
			System.out.println("复制开始之前a中元素为:");
		printlnArray(a);
			System.out.println("");
			System.out.println("复制开始之前b中元素为:");
		printlnArray(b);
			System.out.println("");
			System.out.println("复制开始之后b中元素为:");
		printlnArray(b);
	}
		public static void printlnArray (int [] array){
			for(int  i=0;i<array.length;i++){
				System.out.print(array[i]+" ");
			}
		}
}