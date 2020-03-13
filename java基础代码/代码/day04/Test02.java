public class Test02 {
	public static void main(String[] args) {
		int pointer=0;
		while(pointer<=100){
			switch(pointer%3){
			case 1:
				System.out.println("1");//pointer+=1;
				break;
			case 2:
				System.out.println("2");//pointer+=2;
				break;
			case 3:
				System.out.println("3");//pointer+=3;
				break;
			}
			System.out.println(".......");
		}
	}
}
