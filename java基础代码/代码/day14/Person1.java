 class Person {
		private String name;
		private int age;
		 Person(){
			System.out.println("�ܲ�");
		}
		public void speak(){
			System.out.println(name+"...."+age);
		}
}
 public class Person1{
 	public static void main(String[] args) {
 		Person  p = new Person();
 		p.speak();
	}
}