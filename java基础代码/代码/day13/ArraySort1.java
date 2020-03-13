/*选择排序*/
public class ArraySort1{
	public static void main(String [] args){
		int [] arr={12,32,65,45,7,9};
		System.out.println("排序之前的数组是:");
		print(arr);
		System.out.println();
		System.out.println("排序之后的数组是:");
		arraySort(arr);
	}
	public static void arraySort(int [] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		print(a);
	}
	public static void print(int [] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}
}