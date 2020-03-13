//冒泡排序
public class Array2{
	public static void main(String []args){
		int [] a={16,25,9,90,23};
		int temp=0;
		System.out.println("排序之前的数组:");
		print(a);
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
			 	if(a[j]<a[j+1]){
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}	
			}
		}
		System.out.println("排序之后的数组:");
		print(a);
	}
	public static void print(int [] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
		
	}
}