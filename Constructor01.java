 public class Constructor01 {
	public static void main(String[] args) {
		Person2 p1=new Person2("jack",89);
		System.out.println(p1.name+p1.age);
	}
	}
 class Person2{
	 String name;
	 int age;
	 public Person2(String Name,int Age) {
		 name=Name;
		 age=Age;
		 System.out.println(name+age);
	 }
	 
 }