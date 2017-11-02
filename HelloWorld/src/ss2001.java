import java.util.Scanner;

public class ss2001 {
	static int T;
	static int N;
	static int M;
	static int arr[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int t=0;t<T;t++){
			N = sc.nextInt();
			M = sc.nextInt();
			int MAX = 0;
			arr = new int[N][N];
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					arr[i][j] = sc.nextInt();
				}
			}
			int val = 0;
			
			for(int i=0;i<N-M+1;i++){
				for(int j=0;j<N-M+1;j++){
					for(int k=0;k<M;k++){
						for(int l=0;l<M;l++){
							val = val+arr[i+k][j+l];
						}
					}
					if(MAX<val){
						MAX = val;
					}
					val = 0;
				}
			}
			
			System.out.println("#"+(t+1)+" "+MAX);
		}
	}

}

