/*��������ƽ��ֵ�����ֵ����Сֵ��*/
public class Max{
	public static void main(String []args){
		int [] arr = {23,56,87,54,12};
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];//���ƽ��ֵ
		}
		System.out.println("�������ƽ��ֵ��:"+sum/5);
		int max = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){//������ֵ
				max  = arr [i];
			}
		}
		System.out.println("�������нϴ�ֵΪ:"+max);
		int min = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){//�����Сֵ
				min=arr[i];
			}
		}
		System.out.println("�������н�СֵΪ:"+min);
	}
}