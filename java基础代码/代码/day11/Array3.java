/*��һ��������ַ���a c u  b e p  f  z  ����Ӣ����ĸ����������
˼·:���ȶ���һ�����飬���洢��Щ�ַ���ʹ��forѭ��������������Ƚϴ�С���ϴ�����*/
public class Array3{
	public static void main(String []args){
		System.out.println("�������ַ�����Ӣ����ĸ���������:");
		char [] arr={'a','c','u','b','e','p','f','z'};
		char temp = 0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				temp=arr[i];
				arr[i]=arr[i+1];
				  arr[i+1]=temp;
			}
			System.out.print("\t"+arr[i]);
		}
	}
}
