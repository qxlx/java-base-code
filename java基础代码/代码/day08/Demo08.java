/*���1��10֮�䱻����������*/
public class Demo08{
	public static void main(String[] agrs){
		int i = 0; int sum = 0;
		for(i=1;i<=10;i++){
			if(!(i%3==0)){
				System.out.println("���ܱ�3����������"+i);
			}
			else 
				{
				sum = sum +i;
			}
			
		}
		System.out.println("�ܱ�3��������֮����"+sum);	
	}
}