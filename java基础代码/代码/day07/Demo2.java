/*  c=a+b-->0?b--:a;     c=18  b =18  
b=19  
a+b=30 
b=18*/
public class Demo2{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = 0;
		System.out.println(c = a+(--b)>0?(--b):a);
		System.out.println("b="+b+"c="+c);
		
		
	} 
}
