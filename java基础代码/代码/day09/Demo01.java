/*求1到100之间能被5整除数之和*/
public class Demo01{
	public static void main(String []agrs){
		int sum =0;
		for(int i=0;i<=100;i=i+5){
			if(i%5==0){
				System.out.print("能被5整除是:"+i);
				sum = sum+i;
			}
		}
		 
			System.out.println("sum="+sum);
	}
}