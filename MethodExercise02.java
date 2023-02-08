public class MethodExercise02 {
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		MyTool b = new MyTool();
	    b.printarr(arr);
	    Person p=new Person();
	    p.age=18;
	    p.name="wang";
	   Person p2=b.copyPerson(p);
	   System.out.println(p.age+p.name);
	   System.out.print(p2.age+p2.name);
	}
}
class Person{
	String name;
	int age;
}
class MyTool{//MyTools不断报错，因为之前同一个包的文件曾建过MyTools，改为MyTool解决了
	public Person copyPerson(Person p) {
		Person p2=new Person();
		p2.name=p.name;
		p2.age=p.age;
		return p2;
	}
	public void printarr(int arr[]){
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}  