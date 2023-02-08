public class ObjectHomework07 {
	public static void main(String[] args) {
	Music music=new Music("宝贝",3.45);
	System.out.println(music.getInfor());
	}
	}
class Music{
	String name;
	double times;
	public Music(String Name,double Times) {
		name=Name;
		times=Times;
	}
	public String getInfor() {
		return "当前播放的音乐名称="+name+"\t时长="+times;
	}
}