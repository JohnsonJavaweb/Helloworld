public class LoopHomework03 {
	public static void main(String[] args) {
		int a=154;
		int b=a/100;
		int c=a/10-(b*10);
		int d=(a-(b*100)-(c*10));
		if(a==((b*b*b)+(c*c*c)+(d*d*d))) {
			System.out.println("这个数是水仙花数");
			
		}else {
			System.out.println("这个数不是水仙花数");
			
		//老师的方法
			int n=153;
			int n1=n/100;
		    int n2=n%100/10;
		    int n3=n%10;
		    if(n1*n1*n1+n2*n2*n2+n3*n3*n3==n) {
		    	System.out.println(n+"是水仙花数");
		    }else {
		    	System.out.println(n+"不是水仙花数");
		    }
		}
	}
}