import java.util.Scanner;
public class TestSortSum {
	public static void main(String[] args) {
		SortSum  sort = new SortSum();
		System.out.println("��Ӽ���������5����:");
		int [] arr = new int [5];
		sort.get(arr);
		System.out.println("��������и�ֵ֮�������˳��:");
		sort.show(arr);
		sort.sorts(arr);
		System.out.println("����֮�����������˳��:");
		sort.show(arr);
		System.out.println("������ͽ����:");
		sort.setSum(arr);
		System.out.println("result="+sort.getSum());
		}
}