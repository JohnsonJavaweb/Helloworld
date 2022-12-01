public class ArithmeticOperator {
	public static void main(String[] args) {
		System.out.println(10.0/4);
		double d = 10/4;//java中10/4=2 double 2》2.0
		System.out.println(d);
		//%取模，取余
		//%的本质，看一个公式 a % b= a - a%b*b
		System.out.println(10%3);
		System.out.println(-10%3);//=-10 - (-10)/3*3=-1
		System.out.println(10%-3);// 10-10/-3*-3=1
		System.out.println(-10%-3);//-10-(-10)/-3*-3=-1
		//++的使用
		int i = 10;
		i++;//作为独立的语句使用，自增 i=i+1
		++i;//作为独立的语句使用，自增 i=i+1
		System.out.println("i=" + i);
		/*
		 * 作为表达式使用，
		 * 前++=++i先自增后赋值；
		 * 后++=i++先赋值后自增；
		 */
		int j = 8;
//		int k = ++j;//等价j= j + 1, k = j;
		int k = j++;//等价k=j;j=j+1;
		System.out.println("k =" + k +"j=" + j);
	}
}