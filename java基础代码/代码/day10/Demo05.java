/* 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。*/
public class Demo05{
	public static void main(String []args){
		System.out.println("100到1000之间的水仙花数是:");
		int sum = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		for(int i=100;i<1000;i++){
			x=i/100;
			y=i%100/10;
			z=i%100%10;
			if(i==x*x*x+y*y*y+z*z*z){
				System.out.println(i);
			}
		}
	}
}