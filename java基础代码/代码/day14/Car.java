public class Car {
	public static void main(String[] args) {
		System.out.println("请打印出结果");
		Car c1 = new Car();
		Car c2 = new Car();
		show(c1);
		show(c2);
			
	public static void show(Car c){
		c.num = 3;
		c.color = "red";
		System.out.println(num+"..."+color);
		 }
	}
}
