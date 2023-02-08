public class Array01{
	public static void main(String[] args) {
		double [] hens = {3,5,1,3.4,2,50,7.8};
		System.out.println("数组的长度="+hens.length);
		double totalweight=0;
		for(int i=0;i<hens.length;i++) {
			System.out.println("第"+(i+1)+"个元素的值="+hens[i]);
			totalweight+=hens[i];
		}
		System.out.println("总体重="+totalweight+"平均体重="+(totalweight/hens.length));
	}
}