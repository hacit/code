import java.util.Scanner;

public class ss1946 {
	static int T, P, Q, R, S, W;
	static int arr[];
	static String nrr[];
	static String srr[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int t=0;t<T;t++){
			int N = sc.nextInt();
			arr = new int[N];
			srr = new String[N];
			int max = 0;
			
			for(int i=0;i<N;i++){
				srr[i] = sc.next();
				arr[i] = sc.nextInt();
				max = max+arr[i];
			}
			nrr = new String[max];
			int temp = 0;
			for(int i=0;i<N;i++){
				nrr[arr[i]-1+temp] = srr[i]+"";
				temp = arr[i]+temp;
			}
			for(int i=max-1;i>=0;i--){
				if(nrr[i]==null){
					nrr[i] = nrr[i+1];
				}
			}
			System.out.println("#"+(t+1));
			for(int i=0;i<max;i++){
				if(i!=0&&i%10==0){
					System.out.println("");
				}
				System.out.print(nrr[i]);
			}
			
		}
	}
//1
//3
//A 10
//B 7
//C 5

}

