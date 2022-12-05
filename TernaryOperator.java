public class TernaryOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		int result = a < b? a++:b--;// a>b false，返回b--，先返回b的值，再b-1,返回的结果是99；
		System.out.println("result="+ result);
		System.out.println("a="+ a);
		System.out.println("b="+ b);
	}
}