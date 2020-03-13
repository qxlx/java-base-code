public class Calculator {
		private int number1;
		private int number2;
		private double result;
		
		public void setSum(int number3,int number4){
			result = number3+number4;
		}
		public double getSum(){
			return result;
		}
		public void setSub(int number3,int number4){
			result = number3-number4;
		}
		public double getSub(){
			return result;
		}
		public void setMult(int number3,int number4){
			result = number3 * number4;
		}
		public double getMult(){
			return result;
		}
		public void setDiv(int number3,int number4){
			result = number3/number4;
		}
		public double getDiv(){
			return result;
		}
		/*public String toString(){
			return  "两数之和是:"+result+"\n"+"两数之差是:"+result+"\n"+"两数之积是:"+result
				+"\n"+"两数相除是:"+result+"\n";
		}*/
}
