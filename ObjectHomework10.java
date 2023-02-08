public class ObjectHomework10 { 
	public static void main(String[] args) {
	    Circle1 c=new Circle1();
		PassObject po=new PassObject();
		po.printAreas(c,5);//这里输入c，需要先创建一个Circle1,就是上一句才能输入
	}
	}
class Circle1 {
	double radius;
	
	public double Findarea() {
		return Math.PI*radius*radius;
	}
	public void set(double radius) {
		this.radius=radius;
	}
}
class PassObject{
	public void printAreas(Circle1 c,int times) { 
		System.out.println("radius\tarea");
		for(int i=1;i<=times;i++) {
			c.set(i);
			c.Findarea();
			System.out.println((double)i+"\t"+c.Findarea());
		}
		
	}
}
