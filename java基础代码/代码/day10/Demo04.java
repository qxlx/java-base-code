/*���1*1-2*2+3*3-4*4+5*5
������ż��ƽ��������ӣ���������ƽ��������ӡ������м���������
*/
public class Demo04{
	public static void main(String []args){
		System.out.println("��������:");
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
	System.out.println("�����:"+(total-sum));		
	}
}