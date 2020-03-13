/*将'a' 'b' 'c'逆序输出*/
import java.util.*;
public class Array3{
	public static void main(String []args){
		char [] arr={'a','f','d','h'};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println("该数组中按字母顺序排序为:"+arr[i]);
		}
		for(int i=arr.length-1;i>=0;i++){
			arr[i]=arr[arr.length-1];
			System.out.println("该数组中按逆序排列为:"+arr[arr.length-1]);
		}	
	}
}