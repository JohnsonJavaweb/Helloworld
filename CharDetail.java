public class CharDetail {
	public static void main(String[] args) {
		//在java中，char的本质是一个整数，在输出时，是unicode码对应的字符
		char c1 = 97;
		System.out.println(c1);
		char c2 = 'a';
		System.out.println((int)c2);
		char c3 = '韩';
		System.out.println((int)c3);
		char c4 = 38889;
		System.out.println(c4);
		//char类型是可以运算的，相当于一个整数，因为它都有对应unicode码
		System.out.println('a' + 10);
		//课堂测试
		char c5 = 'b' + 1;
		System.out.println((int)c5);
		System.out.println(c5);
	}
}