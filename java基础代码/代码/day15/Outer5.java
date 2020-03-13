public class Outer5{
	private char sex = '女';
	class Inner5{
		public void accessOuter(){
			System.out.println(sex);
		}
	}
	public static void main(String [] args){
	    Outer5 out = new Outer5();//建立外部类对象
	    //Outer5.Inner5 in =new Outer5().new Inner5();根据外部类对象建立内部类对象
		//in.accessOuter();	
		Outer5.Inner5  in = out.new Inner5();
		in.accessOuter();
	}
}