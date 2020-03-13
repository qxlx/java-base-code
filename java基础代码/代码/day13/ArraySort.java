/*冒泡排序
*/
public class ArraySort{
	public static void main(String []args){
		int [] arr ={23,45,21,56,8,67};
		System.out.println("排序之前的数组:");
		print(arr);
		System.out.println("排序之后的数组:");
		Sort(arr);
	}
	public static void print(int [] a){
		for(int i=1;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}	
	}
	public static void Sort(int [] a){
		for(int x=0;x<a.length-1;x++){
			for(int y=0;y<a.length-1-x;y++){
				if(a[y]>a[y+1]){
					int temp=a[y];
					a[y]=a[y+1];	
					a[y+1]=temp;
				}
			}	
		}
		return a;
	}
}