public class ContinueDetail {
	public static void main(String[] args) {
		lable1:
			for(int j=0;j<2;j++) {
			lable2:
			for(int i=0;i<10;i++) {
				if(i==2) {
//					continue;=continue lable2;
//					continue lable2;推出lable2for循环的本次循环，继续下一次循环
					continue lable1;
				}System.out.println("i="+i);
			}
	}
}
}