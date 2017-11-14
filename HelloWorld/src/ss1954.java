import java.util.Scanner;

public class ss1954 {
	static int T;
	static int N;
	static int x;
	static int y;
	static int d;
	static int val;
	static int arr[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int t=0;t<T;t++){
			N = sc.nextInt();
			arr = new int[N][N];
			x = 0;
			y = 0;
			val = 1;
			int MAXx = N;
			int MAXy = N;
			d = 0;
			
			//방햐아아앙
			
			for(int i=1;i<((N*N)+1);i++){
//				System.out.println(" x: "+x+" y: "+y+" d: "+d+" val : "+val);
				dir();
			}
			
			System.out.println("#"+(t+1));
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
		}
	}
	
	public static void dir(){
		if(d==0){	// >>
			arr[y][x] = val;
			val++;
			x++;
			if(x>=N||arr[y][x]!=0){
				d=1;
				x--;
				y++;
			}
		}else if(d==1){		// ㅜㅜ
			arr[y][x] = val;
			val++;
			y++;
			if(y>=N||arr[y][x]!=0){
				d=2;
				y--;
				x--;
			}
		}else if(d==2){		// <<
			arr[y][x] = val;
			val++;
			x--;
			if(x<0||arr[y][x]!=0){
				d=3;
				x++;
				y--;
			}
		}else if(d==3){		// ㅗㅗ
			arr[y][x] = val;
			val++;
			y--;
			if(y<0||arr[y][x]!=0){
				d=0;
				y++;
				x++;
			}
		}
	}

}

