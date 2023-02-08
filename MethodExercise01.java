public class MethodExercise01 {
	public static void main(String[] args) {
	AA a = new AA();
	if(a.isodd(14)) {
		System.out.println("是个奇数");
	}else {
		System.out.println("是个偶数");
	}
	a.print(10,20,'0');
	}
}
		
class AA{
      
	public boolean isodd(int num) {
//		if(num%2!=0) {
//			return true;
//		}else {
//			return false;
//		}
		return num % 2 !=0? true: false;
	}	
/*思路
 * 1.方法的返回类型void
 * 2.方法的名字 print
 * 3.方法的形参（int low,int col,char c)
 * 4.方法体，循环
 */
public void print(int roll, int col,char c) {
	for(int i=0;i<roll;i++) {
		for(int j=0;j<col;j++) {
			System.out.print(c);
		}
		System.out.println();
	}
}
}


