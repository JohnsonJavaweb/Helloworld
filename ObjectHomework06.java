public class ObjectHomework06 {
	public static void main(String[] args) {
	Cale cale=new Cale(5,0);
	System.out.println("两个数的和="+cale.getsum());
	System.out.println("两个数的差="+cale.getsub());
	System.out.println("两个数的乘="+cale.getmulti());
	Double res=cale.getdividend();//注意这是Double,不是double,double报错
	if(res !=null) {
		System.out.println("两个数的商="+cale.getdividend());
	}else {
		//这里不写，因为下面方法里有提示
	}
	}
}
class Cale{
	double a;
	double b;
	public Cale(double n1,double n2) {
		this.a=n1;
		this.b=n2;
	}
	public double getsum(){
		return a+b;
	}
	public double getsub(){
		return a-b;
	}
	public double getmulti(){
		return a*b;
	}
	public Double getdividend(){
		if(b==0) {
			System.out.println("b不能为0");
			return null; //注意这是Double,不是double,double报错；本来写的是-1，韩老师说结果有可能是-1，
			//只能返回null;
		}
		return a/b;
	}
}
