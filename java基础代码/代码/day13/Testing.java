public class Testing{
	public static void main(String [] args){
		Student zhangSan = new Student();
		Student laoWang = new Student();	
		
		zhangSan.name="张三";
		zhangSan.age=22;
		zhangSan.course="javaEE高级冲刺班";
		//zhangSan.interest="对java老师讲的课比较感兴趣";
		zhangSan.display();
		laoWang.name="老王";
		laoWang.age=28;
		laoWang.course="主攻java";
		//laoWang.speciality="java EE方向";
		laoWang.display();
	}
}