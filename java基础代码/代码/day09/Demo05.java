/*联系乘法口诀表 
1*1=1
1*2=2 2*2=4
1*3=3 2*3=6
*/
public class Demo05{
	public static void main(String [] args){
		System.out.println("输出一个9*9的乘法口诀表");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}