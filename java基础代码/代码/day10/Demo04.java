/*求出1*1-2*2+3*3-4*4+5*5
将所有偶数平方进行相加，所有奇数平方进行相加。最后进行减数操作。
*/
public class Demo04{
	public static void main(String []args){
		System.out.println("请输出结果:");
			int sum = 0;  int j = 0;
			int total =0;  int n= 0;
			for(int i=1;i<=100;i++){
				if(i%2==0){
				j=i*i;
				sum=sum+j;
				}
				else {
				n=i*i;
				total=total+n;
				}
				
		}
	System.out.println("结果是:"+(total-sum));		
	}
}