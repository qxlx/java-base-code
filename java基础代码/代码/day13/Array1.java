/*��ǿforѭ��*/
public class Array1{
	public static void main(String [] args){
		System.out.println("��������ÿһ��Ԫ��:");
		int [][] arr =  {{1,2,3},{4,5,6,7},{8,9}};
		for(int [] temp:arr){
			for(int t:temp){
				System.out.print(t+"\t");
			}
		System.out.println();
		}
	}
}