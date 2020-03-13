//将数组{a,c,u,b,e,p,f,z}按照英文字母表逆序输出
public class Array{
	public static void main(String []args){
		char [] arr={'a','c','u','b','e','p','f','z'};
		System.out.println("该数组未排序之前的顺序是:");
		printArray(arr);
		System.out.println();
		System.out.println("该数组排序之后的顺序是:");
		mathArray(arr);
		printArray(arr);
	}
	public static void  printArray(char [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print("arr["+i+"]="+arr[i]+"\t");
		}
	}
	public static void mathArray(char [] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]<arr[j+1]){
					char temp=arr[j];
					arr[j]=arr[j+1];	
					arr[j+1]=temp;
				}
			}
		}
	}
}