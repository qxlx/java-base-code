public class Outer5{
	private char sex = 'Ů';
	class Inner5{
		public void accessOuter(){
			System.out.println(sex);
		}
	}
	public static void main(String [] args){
	    Outer5 out = new Outer5();//�����ⲿ�����
	    //Outer5.Inner5 in =new Outer5().new Inner5();�����ⲿ��������ڲ������
		//in.accessOuter();	
		Outer5.Inner5  in = out.new Inner5();
		in.accessOuter();
	}
}