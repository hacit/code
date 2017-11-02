import java.util.Scanner;
/*
5 5
#####
#..B#
#.#.#
#RO.#
#####
 */
public class code13460 {
	static int N;
	static int M;
	static int arr[][];
	static int[] B =new int[2];
	static int[] R =new int[2];
	static int[] O =new int[2];
	static String ch[]; 
	static int COU = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N][M];
		ch = new String[N];
		for(int i=0;i<N;i++){
			ch[i] = sc.next()+"";
		}
		for(int i=0;i<N;i++){
			String temp = ch[i];
			for(int j=0;j<M;j++){
				int t = temp.charAt(j);
				int in = 0;
				if(t==35){//#
					in = 1;
				}else if(t==46){	//.
					in = 0;
				}else if(t==66){	//B
					in = 2;
					B[0] = i;
					B[1] = j;
				}else if(t==82){	//R
					in = 3;
					R[0] = i;
					R[1] = j;
				}else if(t==79){	//O
					in = 4;
					O[0] = i;
					O[1] = j;
				}
				arr[i][j] = in;
			}
		}
		
		shake(B,R,2);
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				System.out.print(arr[i][j]+", ");
			}
			System.out.println("");
		}
		
		
	}
	private static void shake(int[] b2, int[] r2, int d) {
		// TODO Auto-generated method stub
		if(COU<10){
		
			if(d==0){	//>>
				//BRB	>>
				for(int j=1;j<M;j++){
					if(arr[B[0]][B[1]+j]==1||arr[B[0]][B[1]+j]==3){
						B[1] = B[1]+j-1;
						break;
					}
				}
				for(int j=1;j<M;j++){
					if(arr[R[0]][R[1]+j]==1||arr[R[0]][R[1]+j]==4){
						R[1] = R[1]+j-1;
						break;
					}
				}
				for(int j=1;j<M;j++){
					if(arr[B[0]][B[1]+j]==1||arr[B[0]][B[1]+j]==3){
						B[1] = B[1]+j-1;
						break;
					}
				}
				
			}else if(d==2){
				//R <<
				for(int j=1;j<M;j++){
					if(arr[R[0]][R[1]-j]==1){
						System.out.println();
						R[1] = R[1]-j+1;
						break;
					}
				}
			}else if(d==1){
				//R ㅜ
				for(int i=1;i<N;i++){
					if(arr[R[0]+i][R[1]]==1){
						R[0] = R[0]+i-1;
						break;
					}
				}
			}else if(d==3){
				//R ㅗ
				for(int i=1;i<N;i++){
					if(arr[R[0]-i][R[1]]==1){
						R[0] = R[0]-i+1;
						break;
					}
				}
			}
		
		}
		COU++;

		
	}

}
