/*输出一个三角形*/
public class Demo03{
	public static void main(String [] args){
		System.out.println("请输出一个三角形:");
		int floor=8;
		char [] arr={' ',' ','A','B','C','D','E','F','G'};
		for(int x=1;x<=floor;x++){
			for(int y=x;y<=floor;y++){
				System.out.print("  ");
			}
			for(int z=1;z<=(x-1)*2-1;z++){
				System.out.print(arr[x]+" ");
			}
			System.out.println();
		}
	}	
}