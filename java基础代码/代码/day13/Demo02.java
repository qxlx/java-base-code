/*�����������״*/
public class Demo02{
	public static void main(String []args){
		System.out.println("�����һ��������");
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
		print();
		print();
	}
	public static void print(){
		System.out.println("    *");
	}
}