class Out{
	int i = 8;
	class In{
		public void display(){
		System.out.println(i);
		//System.out.println(Out.this.i);
		}
	}
	void method(){
		In in = new In();
		in.display();
	}
}
public class InnerDemo02{
	public static void main(String [] agrs){
		Out o = new Out();
		o.method();
	}
}