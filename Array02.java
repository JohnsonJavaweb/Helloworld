import java.util.Scanner;
public class Array02{
	public static void main(String[] args) {
	double a[];
	a=new double[5];
	
	Scanner input=new Scanner(System.in);
	for(int i=0;i<5;i++) {
		System.out.println("请输入第"+(i+1)+"个元素的值");
		a[i]=input.nextDouble();
	}
	for(int i=0;i<5;i++) {
		System.out.println("第"+(i+1)+"个元素的值="+a[i]);
	}
	
	}
}