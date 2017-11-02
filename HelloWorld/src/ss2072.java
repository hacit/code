import java.util.Scanner;

public class ss2072 {
	static int T;
	static int arr[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int t=0;t<T;t++){
			arr = new int[10];
			int MAX = 0;
			for(int i=0;i<10;i++){
				arr[i] = sc.nextInt();
			}
			for(int i=0;i<10;i++){
				if(arr[i]%2==1){
					MAX = MAX+arr[i];
				}
			}			
			
			System.out.println("#"+(t+1)+" "+MAX);
		}
	}

}

