/*求出1到10之间的所有偶数的和*/
public class Demo01{
	public static void main(String []args){
		System.out.println("输出1到10之间的偶数之和：");
			int sum=0;
			for(int i=1;i<=10;i++){
				sum=sum+i;
				if(i%2!=0){
					break;	
			}
		}
			System.out.println("1到10之间的数之和是"+sum);
	}	
}