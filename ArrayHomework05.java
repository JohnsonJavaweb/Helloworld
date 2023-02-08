public class ArrayHomework05 {
	public static void main(String[] args) {
	int arr[]= {20,-1,89,2,890,7};
	int temp=0;
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j]<arr[j+1]) {//老毛病，上面定义了J，就应该用j，不能再用i了，再用i，j就等于没写，只进行一次循环。
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
		}
		
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}
	}