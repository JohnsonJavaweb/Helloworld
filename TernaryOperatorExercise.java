public class TernaryOperatorExercise {
	public static void main(String[] args) {
		int n1 = 553;
		int n2 = 33;
		int n3 = 123;
		int max1 = n1 > n2? n1:n2;
		int max2 = max1 > n3? max1:n3;
		System.out.println("最大的数="+max2);
		//使用一条语句实现
		int max = ( n1 > n2? n1:n2) > n3? ( n1 > n2? n1:n2):n3;
		System.out.println("最大的数="+max);
		int abcclass = 56;
		int n = 40;
		int N = 50;
		System.out.println("n="+n);
		System.out.println("N="+N);
	}
}
	