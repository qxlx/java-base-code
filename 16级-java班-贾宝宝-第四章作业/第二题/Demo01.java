/*请输出一个棱形
*****
****
***
**
*

*/
public class Demo01{
	public static void main(String []args){
		for(int i=1;i<=15;i++){
			for(int j=15;j>=i;j--){
				System.out.print(" ");					
			}
			for(int z=1;z<=i;z++){
				System.out.print("* ");
			}
		System.out.println();
		}
		for(int x=1;x<=15;x++){
			for(int y=1;y<x;y++){
				System.out.print(" ");
			}
			for(int z=x;z<=15;z++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}




















