/*Á·Ï°ĞŞÊÎ·û ¾²Ì¬ static */
class Person{
	String name;
	static String country = "china";
	static public void run(){
		System.out.println("ÈËÅÜ²½"+"\t"+country);
	}
}
public class StaticTest{
	public static void main(String [] args){
		Person  p = new Person();
		p.name = "ÀîËÄ";
		System.out.println(Person.country);
	}
}
