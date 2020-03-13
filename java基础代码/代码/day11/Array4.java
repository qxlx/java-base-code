//Êý×éÁ·Ï°
public class Array4{
	public static void main(String []args){
		int [] arr = {12,23,45,67};
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.print("arr["+i+"]="+arr[i]+"\t");
		}
		for(int i=arr.length-1;i>=0;i--){
			System.out.print("arr["+i+"]="+arr[i]+"\t");
		}
	}
}