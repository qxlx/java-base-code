/*쳲���������*/
public class Recursion{
	public static void main(String []args){
		int i = 5;
		int b =getresult(i);
		System.out.println("������Ϊ:"+b);
	}
	public static int getresult(int n){
		if(n<0)
			return  illegalargumentexception();
		if(n<=1)
			return 1;
		return getresult(n-1)*n;
	}
}