public class Demo04{

	public static void main(String[] args) {
		String str = "abcab";
		String str1 = "ab";
		int num = method(str,str1);
		System.out.println(num);
	}
	public static int  method(String str,String str1){
		int  index = 0;
		int count  = 0;
		while((index=str.indexOf(str1,index))!=1){
				index = index+str1.length();
				count++;
			}
		return  count;
		}
	
}
