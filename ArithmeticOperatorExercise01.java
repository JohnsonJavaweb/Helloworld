public class ArithmeticOperatorExercise01 {
	public static void main(String[] args) {
//		int i = 1;
//		i = i++;//规则：使用临时变量：1.temp=i 2.i=i+1 3.i=temp
//		System.out.println(i);
//		int i = 1;
//		i = ++i;//规则：使用临时变量：1.i=i+1 2.temp=i 3.i=temp
//		System.out.println(i);
		int i1 = 10;
		int i2 = 20;
		int i = i1++;//后++，应先赋值后++，i1=i；i=i+1；
		System.out.print("i="+i);// i=10  去掉ln不换行
		System.out.println("i2="+i2);//20
		i = --i2;//先--,应先--后赋值，i2=i-1;i2=i
		System.out.print("i="+i);//i=i2=19 去掉ln不换行
		System.out.println("i2="+i2);//i2=19
	}
}