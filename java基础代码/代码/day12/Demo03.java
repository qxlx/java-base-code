/*
       A
     B B B
   C C C C C

先输出一个金字塔形状
   *
  ***
 *****



*/
public class Demo03{
	public static void main(String []args){
		System.out.println("请输出一个树形的形状:");
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
