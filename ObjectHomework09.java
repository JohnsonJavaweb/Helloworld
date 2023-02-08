public class ObjectHomework09 { 
	public static void main(String[] args) {
		
		Employee f=new Employee("jack",'女',50);
		Employee g=new Employee("工程师",9876.43);
		Employee e=new Employee("tom",'男',45,"经理",50000.00);
	}
	}
class Employee {
	String name;
	char gender;
	int age;
	String position;
	double salary;
	
	public Employee(String name,char gender,int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		System.out.println(name+gender+age);
}
	public Employee(String position,double salary) {
		this.position=position;
		this.salary=salary;
		System.out.println(position+salary);
}
	public Employee(String name,char gender,int age,String position,double salary) {
		this(name,gender,age);//复用第一个构造器
		this.position=position;//因为this语句必须放在第一句，所以第二个构造器不能复用
		this.salary=salary;
		System.out.println(name+gender+age+position+salary);
	}
}