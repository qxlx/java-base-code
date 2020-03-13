/*输出一个三角形，用* 号打印出来*/
public class Demo03{
	public static void main(String []agrs){
		for(int i=1;i<=5;i++){
			for(int j=i;j<=5;j++){	
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*  
*****
****
***
**
*
规律：行不变  列逐渐减少        
i=1
j=1  *****
j=2  ****
j=3  ***
j=4  **
j=5  *


*
**
***
****
*****
规律：杭埠表









