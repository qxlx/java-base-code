//金字塔[Demo101.java]
public class Demo101{
	public static void main(String []args){
		int lay=10;//表示有多少层
		for(int i=1;i<=lay;i++){
			//找出规律
			//1->3 2->2 3->1 4->0找出空格
			for(int k=1;k<=lay-i;k++){
			System.out.print(" ");
			}
			//打印*
			//1->1 2->3 3->5 4->7找出星的规律
			for(int j=1;j<=(i-1)*2+1;j++){
				System.out.print("*");
			}
			System.out.println();//换行
		}
	}
}