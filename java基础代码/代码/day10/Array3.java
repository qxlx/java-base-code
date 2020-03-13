/*通过引用数组来为，数组赋值*/
public class Array3{
	public static void main(String []args){
		int a[]={2,3,4,5,6};
		int b[]=a;
		for(int i=0;i<5;i++){
			System.out.println("数组中第"+i+"号元素名为:b["+i+"]值为"+b[i]);	
		}
	}
}