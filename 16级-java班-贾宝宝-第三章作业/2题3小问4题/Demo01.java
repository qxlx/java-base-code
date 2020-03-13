/*  1 1 2 3 5 8 13  21   34  55 求前10项的和。
1+1=2      a+b=sum  b=sum   a=b     
1+2=3        
2+3=5    
3+5=8
5+8=13
*/
public class Demo01{
	public static void main(String []args){
		int a = 1;
		int b = 1;
		int c = 0;
		for(int i=1;i<=10;i++){
			c =b;
			b = a + b;
			a =c;
		System.out.println(a+","+b);
	}
		System.out.println(b);
    }
}