public class Demo022 {
	public static void main(String[] args) {
		String str = "abcabcnmv";
		String str1 = "abc";
		int count = method("str",str1);
		System.out.println(count);
	}
	public static int method(String str,String str1){
		int count = 0;
		for(int i=0;i<str.length();i++){
			for(int j=0;j<i;j++){
				if(str.substring(j,i).equals(str1))
					count++;
			}
			
		}
		return count;
	}
}