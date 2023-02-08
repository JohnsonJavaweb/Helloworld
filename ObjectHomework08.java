public class ObjectHomework08 { // 看这个题的输出结果,出不来结果，看老师分析把
	public static void main(String[] args) {
		
	}
	}
class Demo{
	int i=100;
	public void m() {
		int j=i++;
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}
class Test1{
	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=d1;//d2和d1指向同一个对象 i=100, 
		d2.m();
		System.out.println(d1.i);
		System.out.println(d2.i);
	}
}