/*��ϰ���η� ��̬ static */
class Person{
	String name;
	static String country = "china";
	static public void run(){
		System.out.println("���ܲ�"+"\t"+country);
	}
}
public class StaticTest{
	public static void main(String [] args){
		Person  p = new Person();
		p.name = "����";
		System.out.println(Person.country);
	}
}
