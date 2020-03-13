//将数组进行排序
public class Array5{
	public static void main(String []args){
		int [] arr = {12,45,67,34,21};
		print(arr);
		System.out.println("————————");
		selectSort(arr);
		print(arr);
	}
	public static void  print(int [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print("arr["+i+"]="+arr[i]+"\t");
		}
	}
	public static void selectSort(int [] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}