/*���һ����������״����* �Ŵ�ӡ����*/
public class Demo04{
	public static void main(String [] agrs){
		System.out.println("��*�Ŵ�ӡ��һ��������");
		int i; int j;
		for(i=1;i<=9;i++){
				for(j=9;j>=0;j--){
					if(j>=i){
					System.out.print(" "+" ");
					}
				else{
					System.out.print("*"+" ");
				}	
			}
			System.out.println();
		}
		for(i=1;i<=9;i++){
			for(j=1;j<=i;j++){
				System.out.print("*"+" ");
			}
		System.out.println();
		}	
	}
}
