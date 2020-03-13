/*使用方法 在主方法中调用*/
public class Array4{
	public static void main(String []args){
		int [] a ={34,65,87,98,23};
		int total=0;  int max=0; int min=0;
		total=average(a);
		System.out.println("该数组中平均值是:"+total/5);
		max=maxNumber(a);
		System.out.println("该数组中较大值是:"+max);
		min=minNumber(a);
		System.out.println("该数组中较小值是:"+min);
	}
	public static int average(int []a){
		int sum=0;
		for(int i=0;i<a.length;i++){
		sum=sum+a[i];
		}
		return sum;
	}
	public static int maxNumber(int [] a){
		int max=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
	}
	public static int minNumber(int []a){
		int min=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]<a[0]){
				min=a[i];
			}
		}
		return min;
	}
}