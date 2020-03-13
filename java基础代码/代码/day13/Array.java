/*二维数组练习*/
public class Array{
	public static void main(String [] args){
		System.out.println("请输出二维数组的的每个值:");
		int [][] arr = {{1,2},{3,4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+"\t");
			}
		System.out.println();
		}
	}
}