import java.util.Scanner;
//�ӿ���̨����������������ж�����������нϴ������
public class Demo4{
    public static void main(String []args){
	System.out.println("������������");
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	int temp;
	int temp1;
	temp = (a>b)?a:b;
	temp1 =  (temp>c)?temp:c;
	System.out.println("�������нϴ�ֵΪ:"+temp1);		
	
  }
}