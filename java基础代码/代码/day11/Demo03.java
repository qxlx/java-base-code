/*设置一个函数，进行调用*/
public class Demo03{
	public static void main(String []args){
		int sum=0;
		sum=add(5,6);
		System.out.println("sum="+sum);
	}
	public static int add(int a,int b){
		int c = a+b;
		return c;
	}
}