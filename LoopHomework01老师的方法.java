public class LoopHomework01老师的方法 {
	public static void main(String[] args) {
		double money=100000;
		int count=0;
		while(true) {//无限循环
			if(money>50000) {
				money*=0.95;
				count++;
			}else if(money >=1000 && money<=50000) {
				money-=1000;
				count++;
			}else{//不够1000
				break;
			}
			
		}
				System.out.println("100000可以通过"+count+"次关口");
	}
}