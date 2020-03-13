/*数组复制*/
public class ArrayCopy{
	public static void main(String []args){
		int a = 8;
		int b;
		b=a;
		System.out.println(b);
		int [] c={89,78,67};
		int [] d;
		d=c;
			System.out.println(d);
		int [] m={9,7,5,56,78,56};
		int [] n=new int[m.length];
		System.out.println("m数组中对应的每一个元素的默认值输出为:");
			for(int i=0;i<m.length;i++){
				System.out.print(m[i]+"\t");
			}
			System.out.print("\n");
		System.out.println("n数组中对应的每一个元素的默认值输出为:");
			for(int i=0;i<m.length;i++){
				System.out.print(n[i]+"\t");
			}
			System.out.print("\n");
		System.out.println("将m数组中的每一个元素赋值给n数组中对应的每一个元素的值是:");
			for(int i=0;i<m.length;i++){
				n[i]=m[i];
				System.out.print(n[i]+"\t");
		}
	}
}