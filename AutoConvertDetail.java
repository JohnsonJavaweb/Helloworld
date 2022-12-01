public class AutoConvertDetail {
	public static void main(String[] args) {
		//有多种数据类型的数据混合运算时
		//系统首先自动将所有数据转换为容量最大的那种数据类型，然后再进行计算
		int n1 = 10;
		float d1 = n1 + 1.1f;
		double e1 = n1 + 1.1;
		System.out.println(d1);
		System.out.println(e1);
		//当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时，
		//就会报错，反之就会进行自动类型转换
	}
}