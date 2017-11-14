import java.util.Scanner;

public class ss1989 {
	static int T;
	static int arr[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int t=0;t<T;t++){
			String s = sc.next();
			arr = new int[s.length()];
			for(int i=0;i<s.length();i++){
				arr[i] = s.charAt(i);
			}
			int res = 1;
			for(int i=0;i<s.length()/2;i++){
				if(arr[i]==arr[s.length()-i-1]){
					
				}else{
					res = 0;
				}
			}
			
//			System.out.println(s);
			System.out.println("#"+(t+1)+" "+res);
		}
	}
	

}

