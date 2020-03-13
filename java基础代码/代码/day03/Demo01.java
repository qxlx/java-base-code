//练习三目运算符。    结果是9.0  原因是前面是一个float类型，所以后面应该是float 
public class Demo01{
	public static void main(String[] agrs){
		int x=4;
		System.out.println("value is "+((x>5)?99.9:9));
	}
}