public class IfExercise01 {
	public static void main(String[] args) {
		double n1 = 50.3;
		double n2 = 17.5;
		if(n1 > 10 && n2 < 20) {
				System.out.println("两个数的和="+ (n1 + n2));
			}
		int a = 7;
		int b = 9;
		if ((a + b)%3==0 && (a + b)%5==0) {
			System.out.println("两个数的和能被3又能被5整除");
		}else {
			System.out.println("两个数的和不能被3和被5整除");
		int year = 2028;
		if ((year % 4 ==0 && year % 100 != 0)|| year % 400 == 0) {
			System.out.println(year + "是闰年");
		}else {
			System.out.println(year + "不是闰年");
		}
		}
		}
	}
	