/*创建一个数组，把26个字母动态输入数组中去，然后在反向显示输出*/
import java.util.Scanner;
public class Demo01{
	public static void main(String [] agrs){
		System.out.println("请输入26个大写英文字母:");
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