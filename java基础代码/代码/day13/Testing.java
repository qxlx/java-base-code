public class Testing{
	public static void main(String [] args){
		Student zhangSan = new Student();
		Student laoWang = new Student();	
		
		zhangSan.name="����";
		zhangSan.age=22;
		zhangSan.course="javaEE�߼���̰�";
		//zhangSan.interest="��java��ʦ���ĿαȽϸ���Ȥ";
		zhangSan.display();
		laoWang.name="����";
		laoWang.age=28;
		laoWang.course="����java";
		//laoWang.speciality="java EE����";
		laoWang.display();
	}
}