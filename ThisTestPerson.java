public class ThisTestPerson {
	public static void main(String[] args) {
		Person4 p1=new Person4("jack",40);
		Person4 p2=new Person4("smith",40);
		System.out.println(p1.compareTo(p2));
	}
	}
class Person4{
	String name;
	int age;
	public Person4(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public boolean compareTo(Person4 p) {
		
//		if(this.name.equals(p.name) && this.age==p.age) {
//			return true;
//		}else {
//			return false;
//		}
	       return this.name.equals(p.name)&& this.age==p.age;//与上面写法相同，更简洁
}
}
	
