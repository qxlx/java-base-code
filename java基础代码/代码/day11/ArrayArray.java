/*¶şÎ¬Êı×éÁ·Ï°*/
public class ArrayArray{
	public static void main(String []args){
		int [][]  arr={{1,2,3},{4,5,6}};
		int[] a=arr[0];
		print(a);
		System.out.println();
		int[] b=arr[1];
		print(b);
		System.out.println();
	}
	public static void print(int []c){
		for(int i=0;i<c.length;i++){
			System.out.println(" "+c[i]);
		System.out.println();
			}
		}
}