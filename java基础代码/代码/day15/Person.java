public class Person { 
    private String name;  
    private int age;  
  
    public show1() {  
        show("Dick", 12);  
    }  
  
    public Person(String n) {  
        this(n, 12);  
    }  
  
    public void show(String n, int a) {  
        name = n;  
        age = a;  
    }  
    public String toString(){
    	return name+age;
    }
    public static void main(String[] args) {
		Person p = new Person();
		p.show1();
		System.out.println(p.toString());
	}
}  