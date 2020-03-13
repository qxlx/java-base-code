/*输出三角形形状*/
public class Demo01{
	public static void main(String []args){
		System.out.println("请输出一个三角形");
		int floor=6;
		for(int x=1;x<=floor;x++){
			for(int y=1;y<=floor-x;y++){
				System.out.print(" ");
			}
			for(int z=1;z<=(x-1)*2-1;z++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}