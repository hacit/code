import java.util.Scanner;

public class ss1284 {
	static int T, P, Q, R, S, W;
	static int arr[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int t=0;t<T;t++){
			P = sc.nextInt();	//A의 사용금
			Q = sc.nextInt();	//B의 기본료
			R = sc.nextInt();	//월간 이하인 경우 
			S = sc.nextInt();	//추가금
			W = sc.nextInt();	//사용량
			
			int a = P*W;
			int b = 0;
			if(W>R){
				b = Q+S*(W-R);
			}else{
				b = Q;
			}
			
			int res = 0;
			if(a>b){
				res = b;
			}else{
				res = a;
			}
			
			System.out.println("#"+(t+1)+" "+res);
		}
	}
	

}

