/*��ϰ1��100֮�����  6�ı������ֵĴ���*/
public class Demo08{
	public static void main(String [] args){
		System.out.println("��ӡ���6�ı���");
		int count=1;
		for(int i=1;i<=100;i++){
			if(i%6==0){
				count++;
				System.out.println("�ܱ�6��������:"+i);
			}
		}
		System.out.println("������"+count);
	}
}