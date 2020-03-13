//¾²Ì¬ÄÚ²¿Àà
public class StaticOuter{
	private static int i =1;
	private int j = 10;
	public static void outer_f1(){	
	}
	public void outer_f2(){}
	static class Inner{
		static int inner_i =100;
		int inner_j = 200;
		static void inner_f1(){
			System.out.println("Outer.i ="+i);
			outer_f1();
		}
		void inner_f2(){
			//System.out.println("Outer.j"+j);
			//outer_f2();
		}
	}
	public void outer_f3(){
		System.out.println(Inner.inner_i);
		Inner.inner_f1();
		Inner  inner = new Inner();
		inner.inner_f2();
	}
	public static void main(String [] args){
		StaticOuter stat = new StaticOuter();
		stat.outer_f3();
	}
}