//�ڲ���������ϰ
//����ԭ������ʹ�������ڲ����ʱ�򣬴��������ʱ���Զ����е��˶������͵�����������
//�ڴ˵����������������ʱ���ǲ��ܷ��ʵ��ġ�
class Outer{
	void method(){
		Object obj = new Object(){
			public void show(){
				System.out.println("show run");
			}
		};
		obj.show();
	}
}
class InnerDemo{
	public static void main(String [] agrs){
		Outer out = new Outer();
		out.method();
	}
}