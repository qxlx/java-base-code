public class Demo01{
	public static void main(String [] args){
		int m=get(10);
		System.out.println("result:"+m);
	}
	public static int get(int n){
		if(n==1||n==2){
		return 1;
		}
		else{
		return get(n-1)+get(n-2);
		}
	}	
}