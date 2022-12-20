public class LoopHomeWork07{
	public static void main(String[] args) {
//	int sum=0;自己的方法也能做出来。
//	for(int n=1;n<=100;n++) {
//		sum+=n*(101-n);
//	}
//	System.out.println("sum="+sum);
	//老师的方法,很牛逼，帮我把九九乘法表给解决了。
		int sum=0;
		for(int i=0;i<=100;i++) {
			for(int j=0;j<=i;j++) {
				sum+=j;
		
//	int sum=0; 这是九九乘法表的代码，就是用的这个题的双循环
//	for(int i=1;i<=9;i++) {
//		for(int j=1;j<=i;j++) {
//			sum+=j;
//			System.out.print(i+"*"+j+"="+i*j+"\t");
//			if(i==j) {
//				System.out.println();
			}
		}
		System.out.println("sum="+sum);
	}
	
	}
	