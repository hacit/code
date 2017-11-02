import java.util.Scanner;

public class ss1204 {
	static int T;
	static int arr[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true){
			T = sc.nextInt();
	//		for(int t=0;t<T;t++){
			arr = new int[101];
			for(int i=0;i<1000;i++){
				int temp = sc.nextInt();
				arr[temp] = arr[temp]+1;
			}
			
			int MAX =0;
			int BEST = 0;
			for(int i=0;i<101;i++){
				if(MAX<arr[i]){
					MAX = arr[i];
					BEST = i;
				}
			}
			System.out.println("#"+(T)+" "+BEST);
				
	//		}
		}
	}

}

