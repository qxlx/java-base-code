/*��������н�С��ֵ*/
public class Min{
	public static void main(String []args){
		System.out.println("����������н�С��ֵ:");
		int a[] = {98,78,-9};
		int min = 0;
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
			     min=a[i];
			}
		}
			System.out.println("�����н�Сֵ��:"+min);
	}
}