/*输出一个金字塔形状，用* 号打印出来*/
public class Demo04{
	public static void main(String [] agrs){
		System.out.println("用*号打印出一个金字塔");
		int i; int j;
		for(i=1;i<=9;i++){
				for(j=9;j>=0;j--){
					if(j>=i){
					System.out.print(" "+" ");
					}
				else{
					System.out.print("*"+" ");
				}	
			}
			System.out.println();
		}
		for(i=1;i<=9;i++){
			for(j=1;j<=i;j++){
				System.out.print("*"+" ");
			}
		System.out.println();
		}	
	}
}
