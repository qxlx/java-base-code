//数组复制
/*import java.util.Arrays;
public class Demo04{
	public static void main(String [] args){
		int [] a={3,6,8,12,56};
		System.out.println("复制之前a的数组:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		int[] b=Arrays.copyOf(a,10);
		System.out.println("复制之后b中的数组:");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+"\t");
		}
	}
}*/
public class Demo04{
	public static void main(String []args){
		int [] a={3,5,56,34,21};
		int [] b=new int [7];
		System.out.println("复制之前a的数组:");
		print(a);
		System.out.println("复制之前b的数组:");
		print(b);
		System.arraycopy(a,1,b,3,3);
		System.out.println("复制之后b的数组:");
		print(b);
	}
	public static void print(int []arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
}