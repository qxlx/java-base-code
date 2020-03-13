/*求数组中的最大值*/
public class Max{
	public static void main(String []args){
		System.out.println("请将数组中的较大值输出:");
		int a[] = {99,87,60};
		int max = 0;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
			System.out.println("此数组中较大值为:"+max);
	}
}