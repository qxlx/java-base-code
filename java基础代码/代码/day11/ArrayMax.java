//���һ�����飬�������ϴ�ֵ������
public class ArrayMax{
	public static void main(String [] args){
		int [] arr={12,34,56,78,89};
		int max=getMax(arr);
		System.out.println("�����нϴ�ֵΪ:"+max);
	}
	public static int getMax(int arr[]){
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>arr[i+1])
				max=arr[i];
		}
		return max;
	}
}