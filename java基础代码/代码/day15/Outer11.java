public class Outer11{
	static class Inner11{
		static String name = "ÀîËÄ";
		int age = 88;
		void show(){
			System.out.println(name+" "+age);
		}
	}
	public static void main(String [] args){
		Outer11.Inner11  n = new Outer11.Inner11();
		Inner11  m = new Inner11();
		m.show();
	}
}