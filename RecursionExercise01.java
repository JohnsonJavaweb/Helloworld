public class RecursionExercise01 {
	public static void main(String[] args) {
		
		M t1=new M();
		t1.fibonacci(2);
		System.out.println("当n=1时对应的斐波那契数="+t1.fibonacci(1));
		N s=new N();
		int day=1;
		int peachnum=s.peach(day);
		if(peachnum!=-1) {
			System.out.println("最初共有桃子="+s.peach(1));
		}
	    
	}
	
}

class N {
	
	public int peach(int a) {
		if(a>=1 && a<=10) {
			if(a==10) {
				return 1;
			}else {
				return 2*peach(a+1)+2;
			}
			
		}else {
			System.out.println("应输入a>=1的数值");
			return -1;
		}
		
		}
	}

class M {
	public int fibonacci(int n) {
		if(n>=1) {
			if(n==1 ||n==2) {
				return 1;
			}else {
				return fibonacci(n-1)+fibonacci(n-2);
			}
		}else {
				System.out.println("要求输入n>=1的整数");
				return -1;
			}
		}
	}