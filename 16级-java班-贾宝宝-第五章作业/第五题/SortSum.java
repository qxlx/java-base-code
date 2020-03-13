/* 编写一个工具类，包含对整形数组排序和求和的方法*/
import java.util.Scanner;
public class SortSum {
	private int sum;
	public  static void get(int [] a){
		for(int i=0;i<a.length;i++){
			Scanner input = new Scanner(System.in);
			int temp = input.nextInt();
			  a[i] = temp;
		}
	}
		public   void show(int [] arr){
			for(int i=0;i<arr.length;i++){
				System.out.print("arr["+i+"]="+arr[i]+"\t");
			}
		System.out.println();
		}
		public  void sorts(int[] arr){
			for(int i=0;i<arr.length-1;i++){
				for(int j=0;j<arr.length-1-i;j++){
					 if(arr[j]>arr[j+1]){
						 int temp = arr[j];
						  arr[j] = arr[j+1];
						  arr[j+1] = temp;
					 }
				}
			}
	}
		public void setSum(int [] arr){
			for(int i=0;i<arr.length;i++){
				 int temp = arr[i];
				 sum = sum+temp;	 
			}
		}
		public int getSum(){
			return sum;
		}
}
