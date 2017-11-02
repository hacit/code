import java.util.Scanner;

public class ss2005 {
	static int T;
	static int arr[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int t=0;t<T;t++){
			int N = sc.nextInt();
			arr = new int[N][N];
			for(int i=0;i<N;i++){
				arr[i][0] = 1;
				arr[i][i] = 1;
			}

			for(int i=1;i<N;i++){
				for(int j=1;j<i;j++){
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
				}
			}

			System.out.println("#"+(t+1));

			
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					if(arr[i][j]!=0){
						System.out.print(arr[i][j]+" ");
					}
				}
				System.out.println("");
			}



		}
	}

}

