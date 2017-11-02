import java.util.Scanner;

public class code14503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int arr[][] = new int[N][M];
		boolean clean[][] = new boolean[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				arr[i][j] = sc.nextInt();
				if(arr[i][j]==1){
					clean[i][j] = true;
				}else{
					clean[i][j] = false;
				}
			}
		}
		
		clean[r][c] = true;

		
		int result = 0;
		int temp = 0;
		
		
		while(true){
			if(temp==4){
				if(d==0){
					if(arr[r+1][c]==1){
						break;
					}else{
						r=r+1;
					}
				}else if(d==1){
					if(arr[r][c-1]==1){
						break;
					}else{
						c=c-1;
					}
				}else if(d==2){
					if(arr[r-1][c]==1){
						break;
					}else{
						r=r-1;
					}
				}else if(d==3){
					if(arr[r][c+1]==1){
						break;
					}else{
						c=c+1;
					}
				}			
				temp=0;
			}
			if(d==0){	//북
				d = 3;
				if(arr[r][c-1]==0&&clean[r][c-1]==false){
					r = r; c = c-1;
					clean[r][c] = true;
					temp = 0;
				}else{
					temp++;
				}
			}else if(d==1){	//동
				d = 0;
				if(arr[r-1][c]==0&&clean[r-1][c]==false){
					r = r-1; c = c;
					clean[r][c] = true;
					temp = 0;
				}else{
					temp++;
				}
			}else if(d==2){	//남
				d = 1;
				if(arr[r][c+1]==0&&clean[r][c+1]==false){
					r = r; c = c+1;
					clean[r][c] = true;
					temp = 0;
				}else{
					temp++;
				}
			}else if(d==3){	//서
				d = 2;
				if(arr[r+1][c]==0&&clean[r+1][c]==false){
					r = r+1; c = c;
					clean[r][c] = true;
					temp = 0;
				}else{
					temp++;
				}
			}
		}
		
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(arr[i][j]==0&&clean[i][j]==true){
					result++;
				}
			}
		}
		
		System.out.println(result);
		
	}
	public static void func(){
		
	}
}
