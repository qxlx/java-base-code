/* 打印输出0-200之间被7整除但不能被4整除的所有整数
要求每行显示出6个数*/
public class Demo01{
	public static void main(String []args){
		System.out.println("显示出能被7整除，不能被4整除的0-200之间的数:");
		int m = 0;
		int i = 0;
		for(m=0;m<=200;m++){
			if((m%7==0)&(!((m%4)==0))){
					i = i+1;
				       System.out.print(m+"  ");
					if(i%6==0){
					System.out.println();
				}
			}
			
		}
	}
}