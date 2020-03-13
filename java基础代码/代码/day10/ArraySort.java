/*通过键盘任意输入一组数，存在数组中，然后对数组中的元素进行排序*/
import java.util.*;
public class ArraySort{
	public static void main(String []args){
		Scanner input =new Scanner(System.in);
		System.out.println("请您输入五位学员的成绩:");
		int a[]= new int [5];
		for(int i=0;i<a.length;i++){
			System.out.println("请您输入第"+i+"位学员的成绩:");
			a[i]=input.nextInt();
		}
			System.out.println("您输入的分数数据排序前为:");
				for(int i=0;i<a.length;i++){
					System.out.print(a[i]+"\t");
				}
		Arrays.sort(a);
			System.out.println("\n您输入的分数数据排序后为:");
				for(int i=0;i<a.length;i++){
					System.out.print(a[i]+"\t");
				}
	}
}