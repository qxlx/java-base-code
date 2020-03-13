/*求出1到10之间被三整除的数*/
public class Demo08{
	public static void main(String[] agrs){
		int i = 0; int sum = 0;
		for(i=1;i<=10;i++){
			if(!(i%3==0)){
				System.out.println("不能被3整除的数是"+i);
			}
			else 
				{
				sum = sum +i;
			}
			
		}
		System.out.println("能被3整除的数之和是"+sum);	
	}
}