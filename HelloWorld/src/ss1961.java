import java.util.Scanner;

public class ss1961 {
	static int T, N;
	static int arr[][];
	static int tur[][];
	static int turw[][];
	static int turt[][];


	static String res[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int t=0;t<T;t++){
			N = sc.nextInt();	//A의 사용금
			arr = new int[N][N];
			tur = new int[N][N];
			turw = new int[N][N];
			turt = new int[N][N];
			res = new String[N][N];
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					arr[i][j] = sc.nextInt();
 					res[i][j] = "";
				}
			}
			
			for(int i=0;i<N;i++){	//90
				for(int j=0;j<N;j++){
					tur[i][N-j-1] = arr[j][i];
				}
			}
			
			for(int i=0;i<N;i++){	//90
				for(int j=0;j<N;j++){
					turw[i][N-j-1] = tur[j][i];
				}
			}
			for(int i=0;i<N;i++){	//90
				for(int j=0;j<N;j++){
					turt[i][N-j-1] = turw[j][i];
				}
			}
			
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					res[i][0] = res[i][0]+tur[i][j];
				}
			}
			
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					res[i][1] = res[i][1]+turw[i][j];
				}
			}
			
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					res[i][2] = res[i][2]+turt[i][j];
				}
			}
			
			System.out.println("#"+(t+1));

			
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
//					for(int k=0;k<N;k++){
//						res[i][j] = res[i][j]+""+arr[k][j];
//					}
					System.out.print(res[i][j]+" ");
				}
				System.out.println("");
			}
			
			
			//00>0N 01> 1N 
			
			
			
//			for(int i=0;i<N;i++){
//				
//			}
			
			
			
			
			
			
		}
	}
	

}

