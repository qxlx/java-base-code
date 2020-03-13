/*求出数组的平均值，最大值，最小值。*/
public class Max{
	public static void main(String []args){
		int [] arr = {23,56,87,54,12};
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];//求出平均值
		}
		System.out.println("该数组的平均值是:"+sum/5);
		int max = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){//求出最大值
				max  = arr [i];
			}
		}
		System.out.println("该数组中较大值为:"+max);
		int min = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){//求出最小值
				min=arr[i];
			}
		}
		System.out.println("该数组中较小值为:"+min);
	}
}