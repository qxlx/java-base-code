/*求出1到10之间所有数的阶乘
1=1*1    t=1*1
2=1*2	 t=t*2
3=1*2*3

*/
public class Demo03{
	public static void main(String []args){
		int t=0;int j=1; int sum=0;
		for(int i=1;i<=10;i++){
			t=j*j;
			++j;
			sum=sum+t;
		}
		System.out.println(sum);
	}
}