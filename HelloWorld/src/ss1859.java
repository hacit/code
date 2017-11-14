import java.util.Scanner;

public class ss1859 {
	static int T;
	static int N;
	static int arr[];
	static int Tarr[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int t=0;t<T;t++){
			N = sc.nextInt();
			arr = new int[N];
			Tarr = new int[N];
			int top = 0;
			for(int i=0;i<N;i++){
				arr[i] = sc.nextInt();
			}
			int MAX = 0;
			for(int i=N;i>0;i--){
				if(i==N){
					Tarr[i-1] = arr[i-1];
					MAX = arr[i-1];
				}else if(MAX<arr[i-1]){
					Tarr[i-1] = arr[i-1];
					MAX = arr[i-1];
				}else{
					Tarr[i-1] = 0;
				}
			}
			
			
			long SUM = 0;
			int val = 0;
			int cs = 0;
			
			
			for(int i=0;i<N;i++){
//				System.out.print(Tarr[i]+" ");
				if(Tarr[i]==0){
					cs++;
					val = val + arr[i];
				}else{
					SUM = SUM + (Tarr[i]*cs)- val;
					cs = 0;
					val = 0;
				}
			}
			
			
			System.out.println("#"+(t+1)+" "+SUM);
			
		}
	}

}

