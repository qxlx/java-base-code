public class PersonTest {
	class Student {
		String name;
		int age;
		void study(){
			System.out.println(name+"study.."+age);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonTest s = new  PersonTest();
		s.name="zhangsan";
		s.age=10;
		s.study();
	}

}