/*求出1到10之间的整数相加，得到的值累加值大于20的当前数。每次累加的数都和20进行比较，大于20 输出当前的数。*/
public class Demo01{
	public static void main(String [] args){
		int sum =0;int j=0;
		for(int i=1;i<=10;i++){
			sum = sum +i;
			j++;
			if(sum>20){
				break;
			}
			System.out.println("此时j="+j);
		}
		System.out.println("当前的数是:"+j);
		System.out.println("总数:"+sum);
	}
}