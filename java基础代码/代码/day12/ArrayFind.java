//基本数组的查找
public class ArrayFind{
	public static void main(String []args){
		int [] arr = {23,34,21,67,35,46,87,88};
		int index=getIndex(arr,88);
		System.out.println("index="+index);
	}
	public static int getIndex(int []arr,int x){
		for(int i=0;i<arr.length;i++){
			if(x==arr[i]){
			return i;
			}
		}
		return -1;
	}
}