import java.util.Scanner;

public class code14500 {
	static int N;
	static int M;
	static long arr[][];
	static long sum[] = new long[4];
	static long pru[] = new long[4];
	static long SUM = 0;
	static long MAX = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new long[N][M];
		sum[0] = 0;
		sum[1] = 0;
		sum[2] = 0;
		sum[3] = 0;
		
		for(int i = 0; i<N; i++){
			for(int j = 0; j<M; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		if((N*M)>=4){
			for(int i = 0; i<N; i++){
				for(int j = 0; j<M; j++){
					loo(i,j,0,0);
					plu(i,j);
				}
			}
		}
		System.out.println(MAX);
//		System.out.println(COU);
		
	}
	

	public static void plu(int x, int y) {
		pru[0] = 0;
		pru[1] = 0;
		pru[2] = 0;
		pru[3] = 0;
		if(x>0){
			pru[3] = arr[x-1][y];
		}else{
			pru[3] = 0;
		}
		if(x<N-1){
			pru[1] = arr[x+1][y];
		}else{
			pru[1] = 0;
		}
		if(y>0){
			pru[2] = arr[x][y-1];
		}else{
			pru[2] = 0;
		}
		if(y<M-1){
			pru[0] = arr[x][y+1];
		}else{
			pru[0] = 0;
		}

		
		long m = 0;
		long s1 = 0;
		s1=pru[0]+pru[1]+pru[2]+arr[x][y];
		long s2 = 0;
		s2=pru[0]+pru[1]+pru[3]+arr[x][y];
		long s3 = 0;
		s3=pru[0]+pru[2]+pru[3]+arr[x][y];
		long s4 = 0;
		s4=pru[1]+pru[2]+pru[3]+arr[x][y];
		if(m<s1){
			m = s1;
		}
		if(m<s2){
			m = s2;
		}

		if(m<s3){
			m = s3;
		}
		if(m<s4){
			m = s4;
		}
		

		if(MAX<m){
			MAX = m;
		}
		
	}


	public static void loo(int x, int y, int d, int count) {
		// TODO Auto-generated method stub
		SUM = sum[0]+sum[1]+sum[2]+sum[3];
		if(MAX<SUM){
			MAX = SUM;
		}
		
		if(count<4&&count>=0){
			if(N==1){
				if(d!=2&&y+1<M+1){
					sum[count]=arr[x][y];
					count++;
					loo(x,y+1, 0, count);
					count--;
					sum[count]=0;
				}
			}else{
				if(d!=2&&y+1<M){
					sum[count]=arr[x][y];
					count++;
					loo(x,y+1, 0, count);
					count--;
					sum[count]=0;
				}
			}
			
			if(d!=0&&y-1>=0){
				sum[count]=arr[x][y];
				count++;
				loo(x,y-1, 2, count);
				count--;
				sum[count]=0;
			}
			if(M==1){
				if(d!=3&&x+1<N+1){
					sum[count]=arr[x][y];
					count++;
					loo(x+1,y, 1, count);
					count--;
					sum[count]=0;
				}
			}else{
				if(d!=3&&x+1<N){
					sum[count]=arr[x][y];
					count++;
					loo(x+1,y, 1, count);
					count--;
					sum[count]=0;
				}
			}
			if(d!=1&&x-1>=0){
				sum[count]=arr[x][y];
				count++;
				loo(x-1,y, 3, count);
				count--;
				sum[count]=0;
			}
		}
		
	}
	
	
}