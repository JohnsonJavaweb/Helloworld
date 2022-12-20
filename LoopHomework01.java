public class LoopHomework01{
	public static void main(String[] args) {
	int i=1;
	int b=1;
	int sum=0;
	while(i>=0) {
		i++;
		if(100000-i*5000<=50000) {
			System.out.println("i="+i);
			break;
		}
		}
	int a=100000-i*5000;
	while(b>=0) {
		b++;
		if(a-b*1000<1000) {
			System.out.println("b="+b);
			break;
		}
		sum=i+b;
	}
	System.out.println("sum="+sum);
	System.out.println("该人可以经过的路口次数为"+(i+b));
	System.out.println("该人可以经过"+(i+b)+"次路口");
	}
}
