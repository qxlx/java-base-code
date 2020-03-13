/*输出一个长宽分别是9的棱形*/
public class Demo04{
	public static void main(String []agrs){
		System.out.println("输出一个长宽分别是9的正方形");
		int i; int j;
		for(i=1;i<=9;i++){
			System.out.println();
				for(j=9;j>=0;j--){
					if(j>=i){
					System.out.print(" "+" ");
					}
				else{
					System.out.print("*"+" ");
				}	
			}
			
		 }
		
		
		for(i=1;i<=9;i++){
			System.out.println();
			for(j=0;j<=9;j++){
				if(j<=i){
					System.out.print(" "+" ");}
				else  
					{System.out.print("*"+" ");
				}
			}
		for(i=1;i<=9;i++){
			System.out.println();
			for(j=1;j<=i;j++){
				System.out.print("*"+" ");
			}
		}
		
		
		}
		for(i=1;i<=9;i++){
			System.out.println();
			for(j=9;j>=i;j--){
				System.out.print("*"+" ");
			}
		}	
	
		
	}	
}