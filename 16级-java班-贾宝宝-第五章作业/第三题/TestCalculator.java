/*���������������мӼ��˳����*/
import java.util.Scanner;
public class TestCalculator {
	public static void main(String[] args) {
		System.out.println("���������������мӼ��˳�����:");
		Scanner  input = new Scanner(System.in);
		Calculator calc = new Calculator();
		int number5 = input.nextInt();
		int number6 = input.nextInt();
		calc.setSum(number5,number6);
		System.out.println(calc.getSum());
		calc.setSub(number5,number6);
		System.out.println(calc.getSub());
		calc.setMult(number5,number6);
		System.out.println(calc.getMult());
		calc.setDiv(number5,number6);
		System.out.println(calc.getDiv());
	}
}
