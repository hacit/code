import java.util.Scanner;

public class code14502 {
	static int arr[][];
	static int N;
	static int M;
	static int MAX=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N][M];
		
		int temparr[][] = new int[N*M][2];
		int plagarr[][] = new int[N*M][2];
		int plagNum = 0;
		int tempNum = 0;
		
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				int temp = sc.nextInt();
					arr[i][j] = temp;
					if(temp==0){
						temparr[tempNum][0] = i;
						temparr[tempNum][1] = j ;
						tempNum++;
					}
					if(temp==2){
						plagarr[plagNum][0] = i;
						plagarr[plagNum][1] = j ;
						plagNum++;
					}
//				}
			}
		}
		int originarr[][] = arr;

		int tempx = 0;
		int tempy = 0;
		
		//// three touch
		for(int i=0;i<tempNum;i++){
			arr[temparr[i][0]][temparr[i][1]]=1;
			for(int j=i+1;j<tempNum;j++){
				arr[temparr[j][0]][temparr[j][1]]=1;
				for(int k=j+1;k<tempNum;k++){
					arr[temparr[k][0]][temparr[k][1]]=1;
					///spread
//					for(int a=0;a<N;a++){
//						for(int b=0;b<M;b++){
////							if(arr[a][b]==2){
////								spread(a,b);
////								arr = originarr;
////							}
//							System.out.print(arr[a][b]+", ");
//						}
//						System.out.println("");
//					}
//					System.out.println("");
					for(int a=0;a<plagNum;a++){
						spread(plagarr[a][0],plagarr[a][1]);
						arr = originarr;
					}
					
					arr[temparr[k][0]][temparr[k][1]]=0;
				}
				arr[temparr[j][0]][temparr[j][1]]=0;
			}
			arr[temparr[i][0]][temparr[i][1]]=0;
		}
		
		
//		for(int i=0;i<N;i++){
//			for(int j=0;j<M;j++){
//				System.out.print(arr[i][j]+", ");
//			}
//			System.out.println("");
//		}
		
		
	}

	private static void spread(int i, int j) {
		// TODO Auto-generated method stub
//		System.out.println(i+", "+j);
		if(i>0&&j>0&&i<N-1&&j<M-1){
			if(arr[i-1][j]==0){	arr[i-1][j] = 2; spread(i-1,j); }
			if(arr[i+1][j]==0){	arr[i+1][j] = 2; spread(i+1,j); }
			if(arr[i][j-1]==0){	arr[i][j-1] = 2; spread(i,j-1); }
			if(arr[i][j+1]==0){	arr[i][j+1] = 2; spread(i,j+1); }
		}
		if(i==0&&i<N-1){
			if(arr[i+1][j]==0){	arr[i+1][j] = 2; spread(i+1,j); }
		}
		if(j==0&&j<M-1){
			if(arr[i][j+1]==0){	arr[i][j+1] = 2; spread(i,j+1); }
		}
		if(i==N&&i>0){
			if(arr[i-1][j]==0){	arr[i-1][j] = 2; spread(i-1,j); }
		}
		if(j==M&&j>0){
			if(arr[i][j-1]==0){	arr[i][j-1] = 2; spread(i,j-1); }
		}
		
		
	}

}
