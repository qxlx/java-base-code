/*Á·Ï°Êı×éArrary  */
public class Array4{
	public static void main(String []args){
		int a[] = {8,9,10,11,11,12};
		int b[] = a;
		for(int i=0;i<=5;i++){
			System.out.print("\t["+i+"]="+a[i]);
		}
		for(int i=0;i<5;i++){
			b[i]*=i;
			System.out.print("\t["+i+"]="+b[i]);
		}
		for(int i=0;i<5;i++){
			System.out.println("\t["+i+"]="+a[i]);
		}
	}
}