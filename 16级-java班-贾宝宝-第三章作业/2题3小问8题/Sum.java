/*求出1到100之间所有整数的和*/
public class Sum{
	public static void main(String []args){
		System.out.println("求出1到100之间所有整数和:");
		int sum = 0;
		for(int i=1;i<=100;i++){
			sum = sum +i;
		}
		System.out.println("和是："+sum);
	}
}