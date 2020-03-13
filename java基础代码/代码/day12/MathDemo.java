//冒泡排序
public class MathDemo{
	public static void main(String []args){
		int [] arr={3,34,54,12,67};
		System.out.println("数组排序之前的顺序:");
		print(arr);
		System.out.println();
		sort(arr);
		System.out.println("数组排序之后的顺序:");
		print(arr);
	}
	public static void print(int [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print("arr["+i+"]="+arr[i]+"\t");
		}
	}
	public static void sort(int [] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=0;y<arr.length-1-x;y++){
				if(arr[y]>arr[y+1]){
					int temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
		}
	}
}