/*ʹ�õݹ����*/
public class ReArray{
	public static void main(String []args){
		int i = 20;
		System.out.println("ֵ�ǣ�"+getResult(i));
	}
	public static int getResult(int n){
		if(n==1||n==2){
			return 1;
		}
		else 
		    return getResult(n-2)+getResult(n-1);
		
	}
}