public class MethodDetail {
	public static void main(String[] args) {
		AAA a=new AAA();
		int res[]=a.getsumandsub(1, 5);
		System.out.println("和="+res[0]);
		System.out.println("差="+res[1]);
		
	}
	}
class AAA{
	public int[] getsumandsub(int a,int b) {
		int arr[]=new int[2];
		arr[0]=a+b;
		arr[1]=a-b;
		return arr;
	}
}