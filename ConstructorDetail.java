 public class ConstructorDetail {
	public static void main(String[] args) {
		Person1 p1=new Person1("king",40);
		Person1 p2=new Person1("tom");
	
	}
	}
 class Person1{
	 String name;
	 int age;
	 public Person1(String Name,int Age){
		 name=Name;
		 age=Age;
		 System.out.println(name+age);
	 }
	 public Person1(String Name){
		 name=Name;
		 System.out.println(name);
 }
	 
 
 }