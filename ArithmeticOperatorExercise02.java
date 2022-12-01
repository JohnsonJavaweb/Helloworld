public class ArithmeticOperatorExercise02 {
	public static void main(String[] args) {
		int days = 3459;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.println(days + "天合"+ weeks + "个星期零" + leftdays + "天");
		
		double huashi = 1234.5;
		double sheshi = 5.0/9*(huashi-100);
		
		System.out.println("华氏温度"+huashi+
				"对应的摄氏温度="+sheshi);
	}
}