/* ��ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ����������磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���*/
public class Demo05{
	public static void main(String []args){
		System.out.println("100��1000֮���ˮ�ɻ�����:");
		int sum = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		for(int i=100;i<1000;i++){
			x=i/100;
			y=i%100/10;
			z=i%100%10;
			if(i==x*x*x+y*y*y+z*z*z){
				System.out.println(i);
			}
		}
	}
}