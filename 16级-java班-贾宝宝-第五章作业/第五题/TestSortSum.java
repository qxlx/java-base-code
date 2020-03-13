import java.util.Scanner;
public class TestSortSum {
	public static void main(String[] args) {
		SortSum  sort = new SortSum();
		System.out.println("请从键盘上输入5个数:");
		int [] arr = new int [5];
		sort.get(arr);
		System.out.println("对数组进行赋值之后的排列顺序:");
		sort.show(arr);
		sort.sorts(arr);
		System.out.println("排序之后的数组排序顺序:");
		sort.show(arr);
		System.out.println("数组求和结果是:");
		sort.setSum(arr);
		System.out.println("result="+sort.getSum());
		}
}