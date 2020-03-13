//镂空金字塔[Demo102.java]
public class Demo102{
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
				//判断该层是否是顶层或者是底层
				if(i==1||i==lay){
				System.out.print("*");
				}else{
					//如果是第一个*
					if(j==1||j==(i-1)*2+1){
					System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();//换行
		}
	}
}