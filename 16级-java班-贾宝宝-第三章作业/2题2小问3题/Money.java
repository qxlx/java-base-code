import java.util.Scanner;
/* 去银行取钱，如果输入的密码是123456
显示登录成功，提示：可以取钱。否则提示
密码错误，请重新输入。*/
public class Money{
	public static void main(String [] agrs){
		System.out.println("银行取钱");
		System.out.println("请输入银行卡密码");
		Scanner input = new Scanner(System.in);
		int passWord =input.nextInt();
		if(passWord == 123456){
			System.out.println("登录成功");
			System.out.println("可以取钱");
		}
		else{
			System.out.println("密码错误");
			System.out.println("请重新输入");	
		}
	}
}