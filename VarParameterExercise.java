public class VarParameterExercise {
	public static void main(String[] args) {
		HspMethod m=new HspMethod();
		System.out.println(m.showScore("张三",12.3,13.4,15,16,17.8,19.7));
	}
	}
class HspMethod{
//	public void showScore(String name, double n1,double n2){
//		System.out.println(name+"两门成绩总分="+(n1+n2));
//	}
//	public void showScore(String name, double n1,double n2,double n3){
//		System.out.println(name+"三门成绩总分="+(n1+n2+n3));
//}
//	public void showScore(String name, double n1,double n2,double n3,double n4,double n5){
//		System.out.println(name+"五门成绩总分="+(n1+n2+n3+n4+n5));
//	}
//	public void showScore(String name, double...nums){
//		double res=0;
//		for(int i=0;i<nums.length;i++) {
//			res +=nums[i];
//		}
//		System.out.println(name+nums.length+"门成绩总分="+res);
//	}
	public String showScore(String name,double n1,double n2) {
		return name+"两门课总成绩="+(n1+n2);
	}
	public String showScore(String name,double n1,double n2,double n3) {
		return name+(n1+n2+n3);
	}
	public String showScore(String name,double n1,double n2,double n3,double n4,double n5) {
		return name+(n1+n2+n3+n4+n5);
	}
	public String showScore(String name,double...nums) {
		double res=0;
		for(int i=0;i<nums.length;i++) {
			res+=nums[i];
		}
		return name+nums.length+"门课总成绩="+res;
		
	}	
}
