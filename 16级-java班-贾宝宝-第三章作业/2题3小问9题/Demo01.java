/*���1��10֮���������ӣ��õ���ֵ�ۼ�ֵ����20�ĵ�ǰ����ÿ���ۼӵ�������20���бȽϣ�����20 �����ǰ������*/
public class Demo01{
	public static void main(String [] args){
		int sum =0;int j=0;
		for(int i=1;i<=10;i++){
			sum = sum +i;
			j++;
			if(sum>20){
				break;
			}
			System.out.println("��ʱj="+j);
		}
		System.out.println("��ǰ������:"+j);
		System.out.println("����:"+sum);
	}
}