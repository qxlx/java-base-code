//�뾲̬��Ա�ڲ������ƣ��ڲ����ʵ����������ʵ�����ⲿ��
public class Outer10{
	int outer_i = 100;
	void test(){
		for(int i=0;i<5;i++){
		class Inner10{
			void display(){	
				System.out.println("display_i="+outer_i);
				}
			}
		Inner10 inner = new Inner10();
		inner.display();
		}
	}
	public static void main(String [] args){
		Outer10 outer = new Outer10();
		outer.test();	
	}
}