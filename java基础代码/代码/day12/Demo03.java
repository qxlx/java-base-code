/*
       A
     B B B
   C C C C C

�����һ����������״
   *
  ***
 *****



*/
public class Demo03{
	public static void main(String []args){
		System.out.println("�����һ�����ε���״:");
		for(int x=1;x<=5;x++){
			for(int y=5;y>x;y--){
				System.out.print(" ");
			}
			for(int z=1;z<=x;z++){
				System.out.print("*");
			}
			for(int z=1;z<=x;z++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
