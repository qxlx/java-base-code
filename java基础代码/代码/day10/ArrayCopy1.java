/*���鸴��*/
public class ArrayCopy1{
	public static void main(String []args){
		int [] a={3,6,5,4,7,8};
		int [] b=new int[10];
			System.out.println("����֮ǰa��Ԫ��Ϊ:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
			System.out.println();
			System.out.println("����֮ǰb��Ԫ��Ϊ:");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+"\t");
		}
			System.out.println();
		System.arraycopy(a,2,b,3,4);
			System.out.println("���ƿ�ʼ֮��b��Ԫ��Ϊ:");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+"\t");
		}
	}
}