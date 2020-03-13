/*培训机构 2006年学员8万人，每年增长0.25  按此速度，到哪年培训机构会达到20万人
定义学员8万  增长率是0.25  

public class Demo01{
	public static void main(String []args){
		double total = 0;
			int j=1;
			total=(1+0.25)*8;
		for(int i=1;i<=10;i++){
			total=(1+0.25)*total; 
			j++;
			if(total>20)
				break;
		}
		System.out.println("j="+j);
		System.out.println("到"+(2006+j)+"年学员人数会达到20万");
	}
}
*/
public class Demo01{
	public static void main(String []args){
	int c='A'/3; 
c+='1'%5; 
System.out.println(c);
	}
}









