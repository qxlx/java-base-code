/*数组复制*/
public class ArrayCopy1{
	public static void main(String []args){
		int [] a={3,6,5,4,7,8};
		int [] b=new int[10];
			System.out.println("复制之前a中元素为:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
			System.out.println();
			System.out.println("复制之前b中元素为:");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+"\t");
		}
			System.out.println();
		System.arraycopy(a,2,b,3,4);
			System.out.println("复制开始之后b中元素为:");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+"\t");
		}
	}
}