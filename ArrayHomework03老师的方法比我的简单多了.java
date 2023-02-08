public class ArrayHomework03老师的方法比我的简单多了 {
	public static void main(String[] args) {
	int arr[]= {10,12,45,90};
	int insertnum=-1;
	int index=-1;
	for(int i=0;i<arr.length;i++) {
		if (insertnum<=arr[i]) {
			index=i;
			break;
		}
	}
	if(index==-1) {
		index=arr.length;
	}
	int arrnew[]=new int[arr.length+1];
	for(int i=0,j=0;i<arrnew.length;i++){
		if(i!=index) {
			arrnew[i]=arr[j];
			j++;
		}else {
			arrnew[i]=insertnum;
		}
	}
	arr=arrnew;
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}
}