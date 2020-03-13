public class Student {
	 String name;
	 int age;
	public void  Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void run(){
		System.out.println("跑步");
	}
}
public class TestStudent {
	public static void main(String[] args) {
		System.out.println("请打印出五个学生的个人信息:");
			Student []  student = new Student[3];
			student[0] = new Student("旺财",20);
			student[1] = new Student();
			student[2] = new Student();
			for(Student stu:student){
				System.out.print(stu);
			}
	}
}