public class MemberOuter{
	private static int i=3;//��Ա����iδ��ֵ��Ĭ��ֵΪ0
	private int j = 10;//����һ����̬��˽�еĳ�Ա����i
	private int k = 20;
	public static void outer_f1(){//����һ���ⲿ�ľ�̬����
	}
	public void outer_f2(){
	}
	class Inner{
		//static int inner_i = 100;
		int j  = 100;
		int i = 1;
		void inner_f1(){
			System.out.println(i);
			System.out.println(j);
			System.out.println(this.j);
			System.out.println(MemberOuter.this.j);
			System.out.println(k);
			outer_f1();
			outer_f2();
		}
	}
	public void outer_f3(){
		Inner inner = new Inner();
		inner.inner_f1();	
	}
	public static void outer_f4(){
		MemberOuter out = new MemberOuter();
		Inner inner = out.new Inner();
		inner.inner_f1();
	}
	public static void main(String [] args){
		MemberOuter  out = new MemberOuter();
		MemberOuter.Inner outin = out.new Inner();
		outin.inner_f1();
	}
}