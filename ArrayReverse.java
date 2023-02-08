public class ArrayReverse{
	public static void main(String[] args) {
	int arr[]= {11,22,33,44,55,66};
	int temp=0;
	for(int i=0;i<3;i++) {
		temp=arr[6-1-i];//个人解读，用来保存arr4,5,6的值，因为下一行，他们的值就变成arr123了，第二行就无效了。
		arr[6-i-1]=arr[i];//没有引入temp值，导致前三个数与后三个一样
		arr[i]=temp;
		
	}
	System.out.println("arr的元素");
	for (int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}
}
