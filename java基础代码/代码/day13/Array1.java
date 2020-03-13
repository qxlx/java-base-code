/*增强for循环*/
public class Array1{
	public static void main(String [] args){
		System.out.println("输出数组的每一个元素:");
		int [][] arr =  {{1,2,3},{4,5,6,7},{8,9}};
		for(int [] temp:arr){
			for(int t:temp){
				System.out.print(t+"\t");
			}
		System.out.println();
		}
	}
}