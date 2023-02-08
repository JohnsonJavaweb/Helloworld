public class MethodParamter {
	public static void main(String[] args) {
	B b = new B();
	int arr[]= {1,2,3};
	b.test100(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"\t");
	}
	Person p=new Person();
	p.name="jack";
	p.age=10;
	b.test200(p);
	System.out.println("\n"+"main"+"\t"+p.age);
	}
}
class Person{
	String name;
	int age;
	
}
class B{
	public void test100(int arr[]) {
		arr[0]=200;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void test200(Person p){
		p= new Person();
		p.name="Tom";
		p.age=99;
		System.out.println("\n"+"test200"+"\t"+p.age);
		
	}
}
