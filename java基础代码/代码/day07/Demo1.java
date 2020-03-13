//练习逻辑运算符 && ||
public class Demo1{
	public static void main(String[]args ){
		int  i = 6;
		//boolean flag1 = 5<3;//f
		//boolean flag2 = 3>(i = 9+4);//t
		/*System.out.println("flag1&flag2的结果是:"+(flag1&flag2));
		System.out.println("flag1|flag2的结果是:"+(flag1|flag2));
		System.out.println("flag1^flag2的结果是:"+(flag1^flag2));
		System.out.println("flag1!flag2的结果是:"+(!flag1));*/
		System.out.println("flag1&&flag2的结果是:"+((5<3)&&(9>(i=(5+3)))));
		System.out.println(i);
	}
}