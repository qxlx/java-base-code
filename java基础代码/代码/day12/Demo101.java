//������[Demo101.java]
public class Demo101{
	public static void main(String []args){
		int lay=10;//��ʾ�ж��ٲ�
		for(int i=1;i<=lay;i++){
			//�ҳ�����
			//1->3 2->2 3->1 4->0�ҳ��ո�
			for(int k=1;k<=lay-i;k++){
			System.out.print(" ");
			}
			//��ӡ*
			//1->1 2->3 3->5 4->7�ҳ��ǵĹ���
			for(int j=1;j<=(i-1)*2+1;j++){
				System.out.print("*");
			}
			System.out.println();//����
		}
	}
}