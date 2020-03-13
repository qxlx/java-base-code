//内部匿名类练习
//问题原因是在使用匿名内部类的时候，创建子类的时候，自动进行的了对象类型的提升，所以
//在此调用子类的特有数据时，是不能访问到的。
class Outer{
	void method(){
		Object obj = new Object(){
			public void show(){
				System.out.println("show run");
			}
		};
		obj.show();
	}
}
class InnerDemo{
	public static void main(String [] agrs){
		Outer out = new Outer();
		out.method();
	}
}