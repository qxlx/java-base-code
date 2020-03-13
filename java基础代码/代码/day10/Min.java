/*求出数组中较小的值*/
public class Min{
	public static void main(String []args){
		System.out.println("请输出数组中较小的值:");
		int a[] = {98,78,-9};
		int min = 0;
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
			     min=a[i];
			}
		}
			System.out.println("数组中较小值是:"+min);
	}
}