/*练习1到100之间的数  6的倍数出现的次数*/
public class Demo08{
	public static void main(String [] args){
		System.out.println("打印输出6的倍数");
		int count=1;
		for(int i=1;i<=100;i++){
			if(i%6==0){
				count++;
				System.out.println("能被6整除数是:"+i);
			}
		}
		System.out.println("总数是"+count);
	}
}