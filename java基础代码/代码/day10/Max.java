/*�������е����ֵ*/
public class Max{
	public static void main(String []args){
		System.out.println("�뽫�����еĽϴ�ֵ���:");
		int a[] = {99,87,60};
		int max = 0;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
			System.out.println("�������нϴ�ֵΪ:"+max);
	}
}