 public class ConstructorExercise {
	public static void main(String[] args) {
		Person3 p1=new Person3();
		Person3 p2=new Person3("jack",89);
		System.out.println("name="+p1.name+" "+"age="+p1.age);
		System.out.println("name="+p2.name+" "+"age="+p2.age);
	}
	}
 class Person3{
	 String name;
	 int age;
	 public Person3(){
		 age=18;
	 }
	 public Person3(String pName,int pAge) {
		 name=pName;
		 age=pAge;
	 }
 }