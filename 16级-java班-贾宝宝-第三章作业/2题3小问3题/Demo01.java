/* ��ӡ���0-200֮�䱻7���������ܱ�4��������������
Ҫ��ÿ����ʾ��6����*/
public class Demo01{
	public static void main(String []args){
		System.out.println("��ʾ���ܱ�7���������ܱ�4������0-200֮�����:");
		int m = 0;
		int i = 0;
		for(m=0;m<=200;m++){
			if((m%7==0)&(!((m%4)==0))){
					i = i+1;
				       System.out.print(m+"  ");
					if(i%6==0){
					System.out.println();
				}
			}
			
		}
	}
}