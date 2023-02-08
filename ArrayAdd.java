public class ArrayAdd{
	public static void main(String[] args) {
	int arr[]= {1,2,3};
	int arrnew[]= new int[arr.length+1];
	for (int i=0;i<arr.length;i++) {
		arrnew[i]=arr[i];
		
	
	
	}
	arrnew[arr.length]=4;
	arr=arrnew;
	for (int i=0;i<arrnew.length;i++) {
		System.out.println(arr[i]);
	}
	
	}
}