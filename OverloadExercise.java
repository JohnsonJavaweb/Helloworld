public class OverloadExercise {
	public static void main(String[] args) {
		Methods method=new Methods();
		System.out.println(method.m(10));
		System.out.println(method.m(4,5));
		System.out.println(method.m("新年快乐"));
		System.out.println(method.max(1, 2));
		System.out.println(method.max(1.1, 1.2));
		System.out.println(method.max(11.1, 1.2,18.3));
	}
	}
class Methods{
	public int m(int n1) {
		return n1*n1;
	}
	public int m(int n1,int n2) {
		return n1*n2;
	}
	public String m(String n3) {
		return n3;
	}
	public int max(int n1,int n2) {
		return n1>n2?n1:n2;
		}
	public double max(double n1,double n2) {
		return n1>n2?n1:n2;
			}
		public double max(double n1,double n2,double n3) {
			double max1=n1>n2? n1:n2;
			return max1>n3? max1:n3; //老师这个方法厉害，学习了
}
	}