public class ObjectHomework05 {
	public static void main(String[] args) {
	Circle c=new Circle();
	c.Perimeter(2.8);
	}
	}
class Circle{
	double radius;
	public void Perimeter(double r){
		double π=3.14;
		this.radius=r;
		double perimeter=2*r*π;
		double area=π*r*r;
		System.out.println("圆的周长="+perimeter+"\t圆的面积="+area);
	}
}