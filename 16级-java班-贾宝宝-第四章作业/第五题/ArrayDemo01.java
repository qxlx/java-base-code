/*使用递归方法，依次输出1到10之间的数*/
public class ArrayDemo01{
	public static void main(String [] args){
		System.out.println("请依次打印出1到10之间的数:");
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