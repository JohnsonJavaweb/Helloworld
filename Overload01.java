public class Overload01 {
	public static void main(String[] args) {
		MyCalculator mycal=new MyCalculator();
		System.out.println(mycal.calculate(1,2,3));
	}
	}
class MyCalculator {
	public int calculate(int n1,int n2) {
		return n1+n2;
	}
	public double calculate(int n1,double n2) {
		return n1+n2;
	}
	public double calculate(double n2,int n1) {
		return n2+n1;
    }
	public int calculate(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
}