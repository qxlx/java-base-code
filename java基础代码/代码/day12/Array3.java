/*��'a' 'b' 'c'�������*/
import java.util.*;
public class Array3{
	public static void main(String []args){
		char [] arr={'a','f','d','h'};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println("�������а���ĸ˳������Ϊ:"+arr[i]);
		}
		for(int i=arr.length-1;i>=0;i++){
			arr[i]=arr[arr.length-1];
			System.out.println("�������а���������Ϊ:"+arr[arr.length-1]);
		}	
	}
}