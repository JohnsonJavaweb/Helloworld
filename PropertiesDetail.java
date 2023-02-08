public class PropertiesDetail {
	public static void main(String[] args) {
	person p1=new person();
	System.out.println("当前这个人的信息");
	
	System.out.println("age="+ p1.age +"name="+p1.name+"sal="+p1.sal+
			"ispass="+p1.ispass);
	}
	}
class person{
	int age;
	String name;
	double sal;
	boolean ispass;
}