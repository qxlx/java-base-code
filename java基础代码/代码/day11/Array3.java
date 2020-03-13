/*有一列乱序的字符，a c u  b e p  f  z  按照英文字母表的逆序输出
思路:首先定义一个数组，来存储这些字符，使用for循环，依次输出，比较大小，较大的输出*/
public class Array3{
	public static void main(String []args){
		System.out.println("将以下字符按照英文字母表逆序输出:");
		char [] arr={'a','c','u','b','e','p','f','z'};
		char temp = 0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				temp=arr[i];
				arr[i]=arr[i+1];
				  arr[i+1]=temp;
			}
			System.out.print("\t"+arr[i]);
		}
	}
}
