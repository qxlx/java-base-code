/*斐波那契数列*/
public class Demo01{
	public static void main(String [] args){
		System.out.println("请输出最终结果是多少:");
		int x=0;
		int y=1;
		for(int i=1;i<10;i++){
			int temp=y;
			y=y+x;
			x=temp;
			System.out.println(x+","+y);
		}
	}
}