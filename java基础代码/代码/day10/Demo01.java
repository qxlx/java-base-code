/*��ѵ���� 2006��ѧԱ8���ˣ�ÿ������0.25  �����ٶȣ���������ѵ������ﵽ20����
����ѧԱ8��  ��������0.25  

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
		System.out.println("��"+(2006+j)+"��ѧԱ������ﵽ20��");
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









