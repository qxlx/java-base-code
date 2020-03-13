import java.util.Scanner;
/*如果小明java成绩大于90分，而且音乐成绩大于80
奖励他一部手机。或者java成绩等于100，音乐成绩
大于70分，奖励他一辆汽车。*/
public class XiaoMing{
	public static void main(String [] args){
	System.out.println("请分别输入小明的成绩：");
	Scanner input = new Scanner(System.in);
	int javaScore = input.nextInt();
	int musicScore = input.nextInt();
	if(javaScore>90)
	{
		if(musicScore>80)
			System.out.println("奖励是一部手机");

	}
	if(javaScore==100){
		if(musicScore>70)
			System.out.println("奖励是一辆车");
	}
	if(javaScore<90){
		if(musicScore<70)
			System.out.println("无奖励");
	}
	}
}