package day01;

public class Animal {
	private String name;
	private int age;
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void eat(){
		System.out.println("³Ô·¹");
	}
	public void sleep(){
		System.out.println("Ë¯¾õ");
	}
}
class Rabbit extends Animal{
	public Rabbit(String name,int age){
		super(name,age);
	}
	public void rabbitEat(){
		System.out.println("ÍÃ×Ó³Ô²İ");
	}
}
class Tiger extends Animal{
	public Tiger(String name,int age){
		super(name,age);
	}
	public void tigerEat(){
		System.out.println("ÀÏ»¢³ÔÈâ");
	}
}
