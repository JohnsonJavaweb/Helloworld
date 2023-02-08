public class MiGong {
	public static void main(String[] args) {
	int map[][]=new int[8][7];
	for(int i=0;i<7;i++) {
		map[0][i]=1;
		map[7][i]=1;
		map[i][0]=1;
		map[i][6]=1;
		map[3][1]=1;
		map[3][2]=1;
	}
	System.out.println("\n当前地图的情况如下");
	for(int i=0;i<map.length;i++) {
		for(int j=0;j<map[i].length;j++) {
			System.out.print(map[i][j]+" ");
		}
		System.out.println();
	}
	TT t1= new TT();
	t1.findway(map,1,2);//这是起始点，可以修改
	System.out.println("\n找路的情况如下");
	for(int i=0;i<map.length;i++) {
		for(int j=0;j<map[i].length;j++) {
			System.out.print(map[i][j]+" ");
		}
		System.out.println();
	}
	}
}
	//0表示可以走 1表示障碍 2表示可以走 3表示走过，是死路
class TT{
	public boolean findway(int map[][],int i,int j) {
		if(map[6][5]==2) {
			return true;
		}else {
			if(map[i][j]==0) {
				map[i][j]=2;
				if( findway(map,i+1,j)) {
					return true;
				}else if(findway(map,i,j+1)) {
					return true;
				}else if(findway(map,i-1,j)) {
					return true;
				}else if(findway(map,i,j-1)) {
					return true;
				}else {
					map[i][j]=3;
					return false;
				}
				
			}else {
				return false;
			}
		}
	}
}


		