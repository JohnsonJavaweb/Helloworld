public class ObjectHomework01 {
	public static void main(String[] args) {
	double arr[]= {1.1,12.3,78.9,35.4,15.2,109.8};
	 A01 a=new A01();
	 a.Max(arr);
	 System.out.println("最大的数max="+a.Max(arr));//括号里不能直接写+max,在main方法里，这是未定义的变量
	 //可以写double returnmax=a.Max(arr).
	}
	}
class A01{
	public double Max(double [] arr){
		double max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
}