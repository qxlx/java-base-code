/*���1��10֮�������ż���ĺ�*/
public class Demo01{
	public static void main(String []args){
		System.out.println("���1��10֮���ż��֮�ͣ�");
			int sum=0;
			for(int i=1;i<=10;i++){
				sum=sum+i;
				if(i%2!=0){
					break;	
			}
		}
			System.out.println("1��10֮�����֮����"+sum);
	}	
}