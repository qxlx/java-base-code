//输出9*9乘法口诀表
public class Demo04{
	public static void main(String []args){
		System.out.println("在控制台上打印出乘法口诀表:");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
		System.out.println();
		}
	}
}