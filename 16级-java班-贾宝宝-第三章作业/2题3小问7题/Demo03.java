/*��for ѭ������1000�ڵ������ĺ�*/
public class Demo03{
	public static void main(String [] agrs){
		System.out.println("���1��1000�������ĺ�");
		int i = 0;
		int sum = 0;
		for(i=1;i<=1000;i=i+2){
			sum = i+ sum;
		}
			System.out.println("sum="+sum);

	}
}